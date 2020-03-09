/*
 * chandler-spring-elasticsearch
 * 2020/1/19 5:28 PM
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

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

/**
 * 用户文档对象
 *
 * @author 钱丁君-chandler 2020/1/19 5:28 PM
 * @version 1.0.0
 * @since 1.8
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(indexName = "user", type = "_doc", shards = 1, replicas = 0)
public class User {
    @Id
    private String id;
    @Field(value = "useName", type = FieldType.Keyword, store = true)
    private String useName;
    @Field(value = "password", type = FieldType.Keyword, store = true)
    private String password;
    @Field(value = "age", type = FieldType.Short, format = DateFormat.date, store = true)
    private short age;
    @Field(value = "brithday", type = FieldType.Date, store = true)
    private String brithday;
    @Field(value = "addresses", type = FieldType.Text, store = true)
    private List<String> addresses;
    @Field(value = "introduction", type = FieldType.Text, store = true)
    private String introduction;
    @Field(value = "memberFlag", type = FieldType.Boolean)
    private Boolean memberFlag;
    @Field(value = "tags", type = FieldType.Auto)
    private List<String> tags;
    @Field(value = "active", type = FieldType.Long)
    private Long active;
    @Field(value = "session_data", type = FieldType.Auto)
    private Object sessionData;
    @Field(value = "onlineTime", type = FieldType.Date)
    private String onlineTime;
}
