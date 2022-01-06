package com.practice.homework.util;


import com.practice.homework.system.admin.pojo.entity.Admin;
import com.practice.homework.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * <b>实体与视图转换工具类</b>
 *
 * @author Arthur
 * @date 2022/1/6
 * @version 1.0.0
 * @since 1.0.0
 */
@Mapper(componentModel = "spring")
public interface PojoMapper {
	PojoMapper INSTANCE = Mappers.getMapper(PojoMapper.class);

	/**
	 * <b>将实体对象转换为视图对象</b>
	 * @param entity
	 * @return
	 */
	AdminVO parseToVO(Admin entity);
}
