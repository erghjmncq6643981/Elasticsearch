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

import com.chandler.spring.elasticsearch.example.entity.User;
import com.chandler.spring.elasticsearch.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

/**
 * UserRepository功能验证
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
    @Autowired
    private UserService userService;
    private CountDownLatch latch = new CountDownLatch(2);

    @Test
//    @Ignore
    public void findByUsename() {
        userService.findById("1").subscribe(u -> {
            log.info("UserRepository find user1:{}", u.toString());
            latch.countDown();
        });
        userMapperRepository.findByUsename("chandler").subscribe(u -> {
            log.info("UserRepository find user2:{}", u.toString());
            latch.countDown();
        });
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Ignore
    public void save() {
        userMapperRepository.save(User.builder()
                .id("2").useName("chandler2").age((short) 18).brithday("2020-01-20")
                .memberFlag(true).active(180L).password("123").build())
                .onErrorResume(e -> userMapperRepository.findById("1")).subscribe(u -> {
            log.info(u.toString());
            latch.countDown();
            latch.countDown();
        });
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
