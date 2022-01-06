package com.practice.homework.service;

import com.practice.homework.system.admin.pojo.vo.AdminVO;

/**
 * @Author
 * @Date 2022/1/6
 * @apiNote
 */
public interface UserService {
	AdminVO findUserByCellphone(String cellphone) throws Exception;
}
