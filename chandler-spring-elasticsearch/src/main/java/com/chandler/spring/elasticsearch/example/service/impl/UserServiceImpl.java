/*
 * chandler-spring-elasticsearch
 * 2020/1/19 6:37 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.service.impl;

import com.chandler.spring.elasticsearch.example.dao.UserRepository;
import com.chandler.spring.elasticsearch.example.entity.User;
import com.chandler.spring.elasticsearch.example.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2020/1/19 6:37 PM
 * @version 1.0.0
 * @since 1.8
 */
@Service
@Configuration
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Flux<User> findAllById(Iterable<String> ids) {
        return userRepository.findAllById(ids);
    }

    @Override
    public Mono<Boolean> existsById(String id) {
        return userRepository.existsById(id);
    }

    @Override
    public Mono<Long> count() {
        return userRepository.count();
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return userRepository.deleteById(id);
    }
}
