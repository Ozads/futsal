package com.ozads.fut.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
//@Configuration
//public class SwaggerConfig {
//
//
//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.softtech.localLevel"))
//                .paths(regex("/rest.*"))
//                .build()
//                .apiInfo(metaInfo());
//    }
//
//    private ApiInfo metaInfo() {
//
//        ApiInfo apiInfo = new ApiInfo(
//                " LocalLevel Of Nepal",
//                "",
//                "",
//                "",
//                new Contact("", "",
//                        "karkideependra58@gmail.com, yubarajoli77@gmail.com"),
//                "",
//                ""
//        );
//
//        return apiInfo;
//    }
//}

@Profile("enable-swagger")
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurerAdapter {

	private static final Logger LOG = LoggerFactory.getLogger(SwaggerConfig.class);

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

	}

	@Bean
	public Docket api() {
		LOG.info("swagger implementation");
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ozads.fut.Controller"))
				.paths(PathSelectors.any()).build().apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		
		//System.out.println("---------------------------------------------");

		ApiInfo apiInfo = new ApiInfo(" Futsal", "", "", "",
				new Contact("", "", ""), "", "");

		return apiInfo;
	}

	// @Profile({ "prod", "staging" })
	@Bean
	public FilterRegistrationBean urlFilter() {
		return new FilterRegistrationBean(new SwaggerUrlFilter());

	}
}