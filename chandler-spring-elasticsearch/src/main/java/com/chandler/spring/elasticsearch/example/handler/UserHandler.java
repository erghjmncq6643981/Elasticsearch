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

import com.alibaba.fastjson.JSON;
import com.chandler.spring.elasticsearch.example.domain.resp.UserGenerate;
import com.chandler.spring.elasticsearch.example.entity.User;
import com.chandler.spring.elasticsearch.example.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

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

    public Mono<ServerResponse> findByUsename(ServerRequest request) {
        Flux<UserGenerate> userGenerateFlux = userService.findByUsename(request.queryParam("name").get()).map(u -> {
            UserGenerate userGenerate = UserGenerate.builder().build();
            BeanUtils.copyProperties(u, userGenerate);
            return userGenerate;
        });
        return ok().contentType(APPLICATION_STREAM_JSON)
                .body(userGenerateFlux, UserGenerate.class);
    }

    public Mono<ServerResponse> save(ServerRequest request) {
        //未能成功解析
        Mono<Boolean> result = Mono.just(true);
        request.exchange().getRequest().getBody().subscribe(buffer->{
            byte[] bytes = new byte[buffer.readableByteCount()];
            buffer.read(bytes);
            //释放buffer资源
            DataBufferUtils.release(buffer);
            User user=JSON.parseObject(new String(bytes),User.class);
            userService.save(user);
        });
        return ok().contentType(APPLICATION_STREAM_JSON)
                .body(result, Boolean.class);
    }

    public Mono<ServerResponse> findAll(ServerRequest request) {
        Flux<UserGenerate> userGenerateFlux = userService.findAll().map(u -> {
            UserGenerate userGenerate = UserGenerate.builder().build();
            BeanUtils.copyProperties(u, userGenerate);
            return userGenerate;
        });
        return ok().contentType(APPLICATION_STREAM_JSON)
                .body(userGenerateFlux, UserGenerate.class);
    }

    public Mono<ServerResponse> findById(ServerRequest request) {
        Mono<UserGenerate> userGenerateMono=userService.findById(request.pathVariable("id")).map(u -> {
            UserGenerate userGenerate = UserGenerate.builder().build();
            BeanUtils.copyProperties(u, userGenerate);
            return userGenerate;
        });
        return ok().contentType(APPLICATION_STREAM_JSON)
                .body(userGenerateMono, UserGenerate.class);
    }

    public Mono<ServerResponse> findAllById(ServerRequest request) {
        List<String> list = new ArrayList<>();
        list.add(request.pathVariable("id"));
        Flux<UserGenerate> users = userService.findAllById(list).map(u -> {
            UserGenerate userGenerate = UserGenerate.builder().build();
            BeanUtils.copyProperties(u, userGenerate);
            return userGenerate;
        });
        return ok().contentType(APPLICATION_STREAM_JSON)
                .body(users, UserGenerate.class);
    }

    public Mono<ServerResponse> existsById(ServerRequest request) {
        return ok().contentType(APPLICATION_STREAM_JSON)
                .body(userService.existsById(request.pathVariable("id")), Boolean.class);
    }


}