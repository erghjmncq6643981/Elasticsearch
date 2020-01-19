/*
 * chandler-spring-elasticsearch
 * 2020/1/19 5:52 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2020/1/19 5:52 PM
 * @version 1.0.0
 * @since 1.8
 */
@Data
@ToString
public class Address {
    @Field(type = FieldType.Keyword)
    private String company;
    @Field(type = FieldType.Keyword)
    private String home;
}
