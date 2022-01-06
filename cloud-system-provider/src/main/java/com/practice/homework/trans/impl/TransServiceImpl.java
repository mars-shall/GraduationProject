package com.practice.homework.trans.impl;

import com.practice.homework.dao.UserDAO;
import com.practice.homework.service.UserService;
import com.practice.homework.system.admin.pojo.vo.AdminVO;
import com.practice.homework.trans.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author
 * @Date 2022/1/6
 * @apiNote
 */
@RestController("transService")
@RequestMapping("/trans/system/admin")
public class TransServiceImpl implements TransService {

	@Resource(name = "userService")
	private UserService userService;

	@PostMapping("/cellphone")
	public AdminVO getUserBycellphone(@RequestParam String cellphone) throws Exception{
		AdminVO adminVO = userService.findUserByCellphone(cellphone);
		if(adminVO != null){
			return adminVO;
		}
		return null;
	}
}
