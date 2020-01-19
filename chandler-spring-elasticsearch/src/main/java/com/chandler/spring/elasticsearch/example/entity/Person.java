package com.chandler.spring.elasticsearch.example.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2019/5/17下午2:02
 * @since 1.8
 */
@Data
@ApiModel(value="测试对象",description = "测试对象")
public class Person {
    @ApiModelProperty(value = "姓名",name="name",example="chandler")
    private String name;
    @ApiModelProperty(value = "年龄",name="age",example="18")
    private String age;
    @ApiModelProperty(value = "性别",name="sex",example="man")
    private String sex;
}
