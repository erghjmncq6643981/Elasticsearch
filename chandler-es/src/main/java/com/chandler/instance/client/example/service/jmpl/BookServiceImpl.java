/*
 * chandler-es
 * 2019-10-13 15:55
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.instance.client.example.service.jmpl;

import com.chandler.instance.client.example.dao.BookRepository;
import com.chandler.instance.client.example.document.Book;
import com.chandler.instance.client.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * ES交互操作-BookService
 *
 * @author 钱丁君-chandler 2019-10-13 15:55
 * @since 1.8
 */
@Service
public class BookServiceImpl implements BookService {

  @Autowired private BookRepository bookRepository;

  @Override
  public Optional<Book> findById(String id) {
    return bookRepository.findById(id);
  }

  @Override
  public Book save(Book blog) {
    return bookRepository.save(blog);
  }

  @Override
  public void delete(Book blog) {
    bookRepository.delete(blog);
  }

  @Override
  public Optional<Book> findOne(String id) {
    return bookRepository.findById(id);
  }

  @Override
  public List<Book> findAll() {
    return (List<Book>) bookRepository.findAll();
  }

  @Override
  public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
    return bookRepository.findByAuthor(author, pageRequest);
  }

  @Override
  public Page<Book> findByTitle(String title, PageRequest pageRequest) {
    return bookRepository.findByTitle(title, pageRequest);
  }
}
