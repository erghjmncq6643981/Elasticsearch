/*
 * chandler-spring-elasticsearch
 * 2020/1/20 1:47 PM
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


import com.chandler.spring.elasticsearch.example.entity.Person;
import com.chandler.spring.elasticsearch.example.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.elasticsearch.core.ReactiveElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Level;

import static org.springframework.data.domain.Sort.Direction.ASC;


/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2020/1/20 1:47 PM
 * @version 1.0.0
 * @since 1.8
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRepositoryTest {

    @Autowired
    UserMapperRepository userMapperRepository;

    @Test
//    @Ignore
    public void findByUsename() {
        Mono<User> users = userMapperRepository.findById("1");
        users.log("test", Level.INFO);
    }

    @Test
    @Ignore
    public void save() {
        Mono<User> user = userMapperRepository.save(User.builder()
                .id("2").useName("chandler2").age((short) 18).brithday("2020-01-20")
                .memberFlag(true).active(180L).password("123").build())
                .onErrorResume(e -> userMapperRepository.findById("1"));
        user.subscribe(u -> {
            log.info(u.toString());
            System.out.println(u.toString());
        });
    }

}
