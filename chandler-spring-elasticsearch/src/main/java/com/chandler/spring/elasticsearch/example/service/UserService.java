/*
 * chandler-spring-elasticsearch
 * 2020/1/19 6:35 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.service;

import com.chandler.spring.elasticsearch.example.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2020/1/19 6:35 PM
 * @version 1.0.0
 * @since 1.8
 */
public interface UserService {
    /**
     * @param [useName]
     * @return reactor.core.publisher.Flux<com.chandler.spring.elasticsearch.example.entity.User>
     * @Description: 根据用户名进行查询
     *
     * @Autnor chandler
     * @create 2020/1/19 6:43 PM
     */
//    Flux<User> selectUsersByUsename(String useName);

    /**
     * @param []
     * @return reactor.core.publisher.Flux<com.chandler.spring.elasticsearch.example.entity.User>
     * @Description: 查询所有用户
     *
     * @Autnor chandler
     * @create 2020/1/19 6:44 PM
     */
    Flux<User> findAll();

    /**
     * @param [ids]
     * @return reactor.core.publisher.Flux<com.chandler.spring.elasticsearch.example.entity.User>
     * @Description: 通过ID查询用户
     *
     * @Autnor chandler
     * @create 2020/1/19 6:44 PM
     */
    Flux<User> findAllById(Iterable<String> ids);

    /**
     * @param [id]
     * @return reactor.core.publisher.Mono<java.lang.Boolean>
     * @Description: 通过ID验证用户是否存在
     *
     * @Autnor chandler
     * @create 2020/1/19 6:44 PM
     */
    Mono<Boolean> existsById(String id);

    /**
     * @param []
     * @return reactor.core.publisher.Mono<java.lang.Long>
     * @Description: 用户总数
     *
     * @Autnor chandler
     * @create 2020/1/19 6:44 PM
     */
    Mono<Long> count();

    /**
     * @param [id]
     * @return reactor.core.publisher.Mono<java.lang.Void>
     * @Description: 通过ID删除用户
     *
     * @Autnor chandler
     * @create 2020/1/19 6:44 PM
     */
    Mono<Void> deleteById(String id);
}
