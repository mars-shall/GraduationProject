package ${packageName};

import com.practice.homework.base.pojo.entity.BaseEntity;
import lombok.Data;

@Data
public class ${className} extends BaseEntity {
	<#list propertyList as property>
		private ${property.type} ${property.name};                  //${property.comment}
	</#list>
}
