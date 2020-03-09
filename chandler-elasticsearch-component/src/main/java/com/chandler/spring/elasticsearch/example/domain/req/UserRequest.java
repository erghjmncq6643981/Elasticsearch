/*
 * chandler-spring-elasticsearch
 * 2020/1/19 6:52 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.domain.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * user请求对象
 *
 * @author 钱丁君-chandler 2020/1/19 6:52 PM
 * @version 1.0.0
 * @since 1.8
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest implements Serializable {

    private String id;
    private String useName;
    private String password;
    private short age;
    private String brithday;
    private List<String> addresses;
    private String introduction;
    private Boolean memberFlag = false;
    private List<String> tags;
    private Long active = 0L;
    private Object sessionData;
    private String onlineTime;
}
