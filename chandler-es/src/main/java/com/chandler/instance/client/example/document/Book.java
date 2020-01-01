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
package com.chandler.instance.client.example.document;

import com.chandler.instance.client.example.entity.BookRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * 图书
 *
 * @author 钱丁君-chandler 2019-10-13 14:59
 * @since 1.8
 */
@Document(indexName = "book", type = "_doc")
@Data
public class Book {

  @Id private String id;
  private String title;
  private String author;
  private String context;
  @Field( type = FieldType.Date, format = DateFormat.custom,
          pattern = "yyyy-MM-dd HH:mm:ss || yyyy-MM-dd || yyyy/MM/dd HH:mm:ss|| yyyy/MM/dd ||epoch_millis")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd HH:mm:ss")
  private Date publishDate;

  public Book(){}

  public Book(BookRequest request){
    id=request.getId();
    title=request.getTitle();
    author=request.getAuthor();
    context=request.getContext();
    publishDate=request.getPublishDate();
  }
}
