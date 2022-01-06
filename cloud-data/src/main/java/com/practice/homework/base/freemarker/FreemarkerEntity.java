package com.practice.homework.base.freemarker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FreemarkerEntity {
	public static void main(String[] args){
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select column_name,data_type,column_comment"+
				" from information_schema.columns where table_schema='graduation_db'"+
				" and table_name='sys_admin' order by ordinal_position asc";
		try{
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			List<Property> propertyList = new ArrayList<Property>();
			while(result.next()){
				String type = result.getString("data_type");
				String name = result.getString("column_name");
				String comment = result.getString("column_comment");
				if ("int".equalsIgnoreCase(type)) {
					type = "Long";
				} else if ("varchar".equalsIgnoreCase(type)) {
					type = "String";
				} else if ("timestamp".equals(type)) {
					type = "Date";
				}
				Property property = new Property();
				property.setType(type);
				property.setName(name);
				property.setComment(comment);
				propertyList.add(property);
			}

			Entity entity = new Entity();
			entity.setPackageName("com.practice.homework.system.admin.pojo.entity");
			entity.setClassName("Admin");
			entity.setPropertyList(propertyList);
			if(FreemarkerUtil.createEntity(entity)){
				System.out.println("目标文件生成成功");
			}else{
				System.out.println("目标文件生成失败");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
