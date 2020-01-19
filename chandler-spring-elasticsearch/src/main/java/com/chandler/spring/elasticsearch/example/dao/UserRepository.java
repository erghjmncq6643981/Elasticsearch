/*
 * chandler-spring-elasticsearch
 * 2020/1/19 6:27 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.dao;

import com.chandler.spring.elasticsearch.example.entity.User;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import reactor.core.publisher.Flux;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2020/1/19 6:27 PM
 * @since 1.8
 */
public interface UserRepository extends ReactiveElasticsearchRepository<User,String> {

    Flux<User> selectUsersByUsename(String useName);
}
