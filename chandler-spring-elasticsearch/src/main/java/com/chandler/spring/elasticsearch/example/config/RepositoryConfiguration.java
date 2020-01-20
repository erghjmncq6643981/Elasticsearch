/*
 * chandler-spring-elasticsearch
 * 2020/1/20 12:03 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient;
import org.springframework.data.elasticsearch.client.reactive.ReactiveRestClients;
import org.springframework.data.elasticsearch.config.AbstractReactiveElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2020/1/20 12:03 PM
 * @version 1.0.0
 * @since 1.8
 */
//@Configuration
@EnableReactiveElasticsearchRepositories(basePackages={"com.chandler.spring.elasticsearch.example.*"})
public class RepositoryConfiguration extends AbstractReactiveElasticsearchConfiguration {

    @Bean
    @Override
    public ReactiveElasticsearchClient reactiveElasticsearchClient() {
        return ReactiveRestClients.create(
                ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build());
    }

}
