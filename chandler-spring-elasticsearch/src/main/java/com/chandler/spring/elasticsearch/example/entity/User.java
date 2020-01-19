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

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2020/1/19 5:28 PM
 * @version 1.0.0
 * @since 1.8
 */
@Data
@ToString
@NoArgsConstructor
@Document(indexName = "user", type = "_doc")
public class User {
    @Field(value = "useName", type = FieldType.Keyword, copyTo = "full_name", store = true)
    private String useName;
    @Field(value = "password", type = FieldType.Keyword, store = true, normalizer="my_normalizer")
    private String password;
    @Field(value = "age", type = FieldType.Short, format = DateFormat.date, copyTo = "full_name", store = true)
    private short age;
    @Field(value = "brithday", type = FieldType.Date, copyTo = "full_name", store = true)
    private String brithday;
    @Field(value = "addresses", type = FieldType.Text, copyTo = "full_name", store = true)
    private List<Address> addresses;
    @Field(value = "introduction", type = FieldType.Text, store = true)
    private String introduction;
    @Field(value = "memberFlag", type = FieldType.Boolean, copyTo = "full_name")
    private Boolean memberFlag;
    @Field(value = "tags", type = FieldType.Keyword)
    private String tags;
    @Field(value = "active", type = FieldType.Long)
    private Long active;
    @Field(value = "session_data", type = FieldType.Auto)
    private Object sessionData;
    @Field(value = "onlineTime", type = FieldType.Date)
    private String onlineTime;
}
