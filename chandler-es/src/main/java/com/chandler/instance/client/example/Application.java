
package com.chandler.instance.client.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ES客户端应用
 * 
 * @version
 * @author kyle 2019年5月9日下午6:25:00
 * @since 1.8
 */
@EnableSwagger2
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
