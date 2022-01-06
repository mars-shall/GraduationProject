package com.practice.homework.controller;

import cn.hutool.crypto.digest.MD5;
import com.practice.homework.base.controller.BaseController;
import com.practice.homework.base.pojo.vo.ResponseVO;
import com.practice.homework.base.util.BaseConstants;
import com.practice.homework.base.util.RedisUtil;
import com.practice.homework.base.util.TokenUtil;
import com.practice.homework.system.admin.pojo.vo.AdminLoginVO;
import com.practice.homework.system.admin.pojo.vo.AdminVO;
import com.practice.homework.trans.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sun.security.util.Password;

import java.util.HashMap;
import java.util.Map;

@RestController("userController")
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private TransService transService;
	@Autowired
	private RedisUtil redisUtil;

	public ResponseVO userLogin(@RequestBody @Validated AdminLoginVO adminLoginVO, BindingResult result) throws Exception{
		if(result.hasErrors()){
			return ResponseVO.getError("请填写正确的手机号码或密码");
		}
		AdminVO adminVO = transService.getUserBycellphone(adminLoginVO.getCellphone());
		if(adminVO == null){
			return ResponseVO.getError("用户信息不存在");
		}
		if(adminVO.getStatus() == 0){
			return ResponseVO.getError("用户已被禁用");
		}
		String password = MD5.create().digestHex(adminLoginVO.getPassword());
		if(!password.equals(adminVO.getPassword())){
			return ResponseVO.getError("手机号或登录密码错误");
		}
		// 此时用户的登录密码正确，那么至此该用户登录成功，使用工具类生成系统唯一令牌（Token）
		Map<String, String> claimMap = new HashMap<String, String>();
		claimMap.put("id", adminVO.getId());
		String token = TokenUtil.createToken(claimMap, BaseConstants.EXPIRE_AUTH_SEC);
		// 以该 Token 作为 Key，以用户对象作为 Value 存储到 Redis 中
		if (redisUtil.saveToRedis(token, adminVO, BaseConstants.EXPIRE_AUTH_SEC)) {
			// 此时将信息存储到 Redis 中成功，那么将 Token 返回给用户
			// 为了将 Token 交给用户存储，那么我们可以选择将 Token 绑定到 HTTP 响应对象的消息头的部分 Authorization
			response.setHeader("Authorization", token);
			// 返回前端登录成功结果
			return ResponseVO.getSuccess("系统用户登录成功", adminVO);
		}
		return ResponseVO.getError("系统登录失败");
	}

}
