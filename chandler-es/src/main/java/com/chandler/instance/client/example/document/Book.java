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
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 图书
 *
 * @author 钱丁君-chandler 2019-10-13 14:59
 * @since 1.8
 */
@Document(indexName = "book", type = "program")
@Data
public class Book {

  @Id private String id;
  private String title;
  private String author;
  private String context;
  private String publishDate;

  public Book(){}

  public Book(BookRequest request){
    id=request.getId();
    title=request.getTitle();
    author=request.getAuthor();
    context=request.getContext();
    publishDate=request.getPublishDate();
  }
}
