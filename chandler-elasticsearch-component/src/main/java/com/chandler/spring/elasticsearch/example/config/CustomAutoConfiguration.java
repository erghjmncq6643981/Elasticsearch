/*
 * chandler-spring-component
 * 2020/3/8 6:06 PM
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

import com.chandler.spring.elasticsearch.example.dao.UserMapperRepository;
import com.chandler.spring.elasticsearch.example.handler.UserHandler;
import com.chandler.spring.elasticsearch.example.service.UserService;
import com.chandler.spring.elasticsearch.example.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableReactiveElasticsearchRepositories;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_STREAM_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

/**
 * 自动装备
 *
 * @author 钱丁君-chandler 2020/3/8 6:06 PM
 * @version 1.0.0
 * @since 1.8
 */
@Configuration
@EnableReactiveElasticsearchRepositories(basePackages = {"com.chandler.spring.elasticsearch.example.*"})
public class CustomAutoConfiguration {

    @Bean
    public RouterFunction<ServerResponse> route(UserHandler handler) {
        return RouterFunctions
                .route(GET("/users")
                        .and(accept(APPLICATION_STREAM_JSON)), handler::findAll)
                .andRoute(PUT("/users/save")
                        .and(accept(APPLICATION_STREAM_JSON)), handler::save)
                .andRoute(GET("/users/find")
                        .and(accept(APPLICATION_STREAM_JSON)), handler::findByUsename)
                .andRoute(GET("/users/find/{id}")
                        .and(accept(APPLICATION_STREAM_JSON)), handler::findById)
                .andRoute(GET("/users/exists/{id}")
                        .and(accept(APPLICATION_STREAM_JSON)), handler::existsById);
    }

    @Bean
    public UserHandler handler(UserService userService) {
        UserHandler handler = new UserHandler();
        handler.setUserService(userService);
        return handler;
    }

    @Bean
    public UserService userService(UserMapperRepository userRepository) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserRepository(userRepository);
        return userService;
    }
}
