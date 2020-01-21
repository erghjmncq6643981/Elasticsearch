/*
 * chandler-spring-elasticsearch
 * 2020-01-20 22:56
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.controller;

import com.chandler.spring.elasticsearch.example.entity.User;
import com.chandler.spring.elasticsearch.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2020-01-20 22:56
 * @since 1.8
 */
//@RestController("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/save", produces = "application/json;charset=utf-8" )
    public Mono<Boolean> save(@RequestBody Mono<User> userMono) {
        Mono<Boolean> resultMono = userMono.flatMap(user -> {
            userService.save(user);
            return Mono.just(Boolean.TRUE);
        });
        return resultMono;
    }
}
