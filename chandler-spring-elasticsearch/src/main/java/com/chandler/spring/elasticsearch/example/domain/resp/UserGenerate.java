/*
 * chandler-spring-elasticsearch
 * 2020/1/19 6:53 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.domain.resp;

import com.chandler.spring.elasticsearch.example.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * BeanUtils.copyProperties(User, UserResponse);
 *
 * @author 钱丁君-chandler 2020/1/19 6:53 PM
 * @version 1.0.0
 * @since 1.8
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserGenerate {
    private String useName;
    private String password;
    private short age;
    private String brithday;
    private List<Address> addresses;
    private String introduction;
    private Boolean memberFlag;
    private String tags;
    private Long active;
    private Object sessionData;
    private String onlineTime;
}
