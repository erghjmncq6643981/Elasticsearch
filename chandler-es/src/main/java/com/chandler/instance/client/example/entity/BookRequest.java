/*
 * chandler-es
 * 2019-10-13 14:59
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.instance.client.example.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 图书请求对象
 *
 * @author 钱丁君-chandler 2019-10-13 14:59
 * @since 1.8
 */
@Data
@ApiModel(value="图书对象",description = "图书对象")
public class BookRequest {
  @ApiModelProperty(value = "序号",example="1")
  private String id;
  @ApiModelProperty(value = "标题",example="Learn Elasticsearch")
  private String title;
  @ApiModelProperty(value = "作者",example="chandler")
  private String author;
  @ApiModelProperty(value = "内容",example="Elasticsearch is a highly scalable open-source full-text search and analytics engine. It allows you to store, search, and analyze big volumes of data quickly and in near real time. It is generally used as the underlying engine/technology that powers applications that have complex search features and requirements.")
  private String context;
  @ApiModelProperty(value = "发布时间",example="2019-10-13")
  private String publishDate;
}
