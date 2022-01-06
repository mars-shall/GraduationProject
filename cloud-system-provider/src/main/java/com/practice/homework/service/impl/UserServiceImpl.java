package com.practice.homework.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.practice.homework.dao.UserDAO;
import com.practice.homework.service.UserService;
import com.practice.homework.system.admin.pojo.entity.Admin;
import com.practice.homework.system.admin.pojo.vo.AdminVO;
import com.practice.homework.util.PojoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author
 * @Date 2022/1/6
 * @apiNote
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	@Override
	public AdminVO findUserByCellphone(String cellphone) throws Exception {
		QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>();
		queryWrapper.eq("cellphone",cellphone);
		Admin admin = userDAO.selectOne(queryWrapper);
		if(admin != null){
			AdminVO adminVO = PojoMapper.INSTANCE.parseToVO(admin);
			return adminVO;
		}
		return null;
	}
}
