/*
 * chandler-spring-elasticsearch
 * 2020/1/19 5:28 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

/**
 * Elasticsearch Java Client(最新版本)测试工程
 * Spring Data Elasticsearch Version: 3.2.4.RELEASE
 * Spring5 Webflux
 * 
 * @version
 * @author 钱丁君-chandler 2020/1/19 5:28 PM
 * @since 1.8
 */
@SpringBootApplication
@EnableReactiveElasticsearchRepositories(basePackages={"com.chandler.spring.elasticsearch.example.*"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
