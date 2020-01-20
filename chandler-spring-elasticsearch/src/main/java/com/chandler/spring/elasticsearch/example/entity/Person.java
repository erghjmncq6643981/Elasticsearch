package com.chandler.spring.elasticsearch.example.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2019/5/17下午2:02
 * @since 1.8
 */
@Data
@Document(indexName = "person", type = "_doc")
public class Person {
    @Id
    private String id;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
