/*
 * chandler-es
 * 2019-10-13 15:32
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.instance.client.example.service;

import com.chandler.instance.client.example.document.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

/**
 * 与ES交互，提供curd功能
 *
 * @author 钱丁君-chandler 2019-10-13 15:32
 * @since 1.8
 */
public interface BookService {
  /**
   * @param [id]
   * @return java.util.Optional<com.chandler.instance.client.example.document.Book>
   * @Description: 
   *
   * @Author chandler
   * @create 2019-10-13 16:18
   */  
  Optional<Book> findById(String id);

  /**
   * @param [blog]
   * @return com.chandler.instance.client.example.document.Book @Description: @Author chandler
   * @create 2019-10-13 15:56
   */
  Book save(Book blog);

  void delete(Book blog);

  Optional<Book> findOne(String id);

  List<Book> findAll();

  /**
   * @param [author, pageRequest]
   * @return
   *     org.springframework.data.domain.Page<com.chandler.instance.client.example.document.Book> @Description: @Author
   *     chandler
   * @create 2019-10-13 15:56
   */
  Page<Book> findByAuthor(String author, PageRequest pageRequest);

  /**
   * @param [title, pageRequest]
   * @return
   *     org.springframework.data.domain.Page<com.chandler.instance.client.example.document.Book> @Description: @Author
   *     chandler
   * @create 2019-10-13 15:57
   */
  Page<Book> findByTitle(String title, PageRequest pageRequest);
}
