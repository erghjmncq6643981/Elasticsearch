/*
 * chandler-spring-elasticsearch
 * 2020/1/19 6:59 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.route;

import com.chandler.spring.elasticsearch.example.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

/**
 * 路由器
 *
 * @author 钱丁君-chandler 2020/1/19 6:59 PM
 * @version 1.0.0
 * @since 1.8
 */
@Configuration
public class UserRouter {
    @Bean
    public RouterFunction<ServerResponse> route(UserHandler userHandler) {
        return RouterFunctions
                .route(GET("/users")
                        .and(accept(APPLICATION_STREAM_JSON)), userHandler::findAll)
                .andRoute(PUT("/users/save")
                        .and(accept(APPLICATION_STREAM_JSON)), userHandler::save)
                .andRoute(GET("/users/find")
                        .and(accept(APPLICATION_STREAM_JSON)), userHandler::findByUsename)
                .andRoute(GET("/users/find/{id}")
                        .and(accept(APPLICATION_STREAM_JSON)), userHandler::findById)
                .andRoute(GET("/users/exists/{id}")
                        .and(accept(APPLICATION_STREAM_JSON)), userHandler::existsById);
    }
}
