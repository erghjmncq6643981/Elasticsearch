/*
 * chandler-spring-elasticsearch
 * 2020/1/19 6:58 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.handler;

import com.chandler.spring.elasticsearch.example.domain.resp.UserGenerate;
import com.chandler.spring.elasticsearch.example.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2020/1/19 6:58 PM
 * @version 1.0.0
 * @since 1.8
 */
@Component
@Configuration
public class UserHandler {

    @Autowired
    private UserService userService;

    public Flux<UserGenerate> findAll() {
        return userService.findAll().flatMap(u -> {
            UserGenerate userResponse = UserGenerate.builder().build();
            BeanUtils.copyProperties(u, userResponse);
            return Flux.generate(sink -> {
                sink.next(userResponse);
                sink.complete();
            });
        });
    }
}
