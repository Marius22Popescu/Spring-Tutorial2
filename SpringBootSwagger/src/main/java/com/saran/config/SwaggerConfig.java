package com.saran.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.google.common.base.Predicates.or;
import  com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import static springfox.documentation.builders.PathSelectors.regex;


import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket postsApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.saran"))
				.paths(regex("/emp/saran.*"))
				.build().apiInfo(apiInfo());
	}
	private ApiInfo apiInfo() {
		
		return new ApiInfoBuilder().title("Emps API")
				.description("Emps API for Developers")
				.termsOfServiceUrl("http://saran.com")
				.contact("saran@gmail.com").license("Sarans License")
				.licenseUrl("saran@gmail.com").version("2.0").build();
	}
		
		private Predicate<String> postPaths() {
			 
			return or(regex("/emp/posts.*"),regex("emp/saran.*"));
		}

}
