/*
 * Swagger2Config.java
 * 2019年6月28日 下午5:28:08
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */

package com.chandler.instance.client.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置
 *
 * @version
 * @author 钱丁君-chandler 2019年6月28日下午5:28:08
 * @since 1.8
 */
@EnableSwagger2
@Configuration
public class Swagger2Config {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).pathMapping("/").select()
				.apis(RequestHandlerSelectors.basePackage("com.chandler.instance.client.example.controller"))// 指定方法接口都来自controller这个包
				.paths(PathSelectors.any())// 选any表示给这个controller包下所有的接口都生成文档
				.build()
				.apiInfo(new ApiInfoBuilder().title("ES客户端测试工程swagger页面")// 生成的接口文档的标题名称
						.description("Elasticsearch客户端示例工程")// 文档摘要
						.version("1.0.0")// API版本，可以自定义
						.build());
	}
}
