package com.practice.homework.base.configuration;

import com.practice.homework.base.util.BaseConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
public class SwaggerConfiguration {
	@Bean
	public Docket createRestAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				// 设定 Swagger 文档生成信息
				.apiInfo(apiInfo())
				// 设定 Swagger 扫描接口的基础包位置
				.select()
				.apis(RequestHandlerSelectors.basePackage(BaseConstants.SWAGGER_BASE_PACKAGE))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				// 设定生成文档的标题
				.title(BaseConstants.SWAGGER_TITLE)
				// 设定生成文档描述信息
				.description(BaseConstants.SWAGGER_DESCRIPTION)
				// 设定文档版本
				.version(BaseConstants.SWAGGER_VERSION)
				// 设定文档维护联系人信息
				.contact(new Contact(BaseConstants.SWAGGER_CONTACT_NAME
						, BaseConstants.SWAGGER_CONTACT_URL
						, BaseConstants.SWAGGER_CONTACT_EMAIL))
				.build();
	}
}
