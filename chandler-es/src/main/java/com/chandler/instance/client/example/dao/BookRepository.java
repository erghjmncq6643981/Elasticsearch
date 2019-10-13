/*
 * chandler-es
 * 2019-10-13 15:27
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.instance.client.example.dao;

import com.chandler.instance.client.example.document.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 类功能描述
 *
 * @author 钱丁君-chandler 2019-10-13 15:27
 * @since 1.8
 */
public interface BookRepository extends ElasticsearchRepository<Book,String> {

    /**
     * @param [author, pageable]
     * @return org.springframework.data.domain.Page<com.chandler.instance.client.example.document.Book>
     * @Description: 
     *
     * @Author chandler
     * @create 2019-10-13 15:30
     */
    Page<Book> findByAuthor(String author, Pageable pageable);

    /**
     * @param [title, pageable]
     * @return org.springframework.data.domain.Page<com.chandler.instance.client.example.document.Book>
     * @Description: 
     *
     * @Author chandler
     * @create 2019-10-13 16:09
     */
    Page<Book> findByTitle(String title, Pageable pageable);
}
