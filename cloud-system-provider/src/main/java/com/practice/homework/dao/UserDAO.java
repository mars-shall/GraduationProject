package com.practice.homework.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practice.homework.system.admin.pojo.entity.Admin;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


/**
 * @Author
 * @Date 2022/1/6
 * @apiNote
 */
@Repository
public interface UserDAO extends BaseMapper<Admin> {
}
