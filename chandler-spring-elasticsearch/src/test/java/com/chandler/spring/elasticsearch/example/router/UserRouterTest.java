/*
 * chandler-spring-elasticsearch
 * 2020/1/21 5:50 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.router;

import com.chandler.spring.elasticsearch.example.domain.resp.UserGenerate;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * router测试
 *
 * @author 钱丁君-chandler 2020/1/21 5:50 PM
 * @version 1.0.0
 * @since 1.8
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRouterTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void route() {
         webTestClient.get()
                .uri("/users").accept(MediaType.APPLICATION_STREAM_JSON).exchange()
                .expectStatus().isOk().returnResult(UserGenerate.class).getResponseBody()
                 .subscribe(u->log.info("spring webflux UserGenerate:{}", u.toString()));
    }

}
