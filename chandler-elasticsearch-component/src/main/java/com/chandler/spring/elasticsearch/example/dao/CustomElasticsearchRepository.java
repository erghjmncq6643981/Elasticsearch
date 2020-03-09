/*
 * chandler-elasticsearch-component
 * 2020/3/8 4:42 PM
 *
 * Please contact chandler
 * if you need additional information or have any questions.
 * Please contact chandler Corporation or visit:
 * https://www.jianshu.com/u/117796446366
 *
 * @author 钱丁君-chandler
 * @version 1.0
 */
package com.chandler.spring.elasticsearch.example.dao;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ReactiveElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;
import reactor.core.publisher.Flux;

/**
 * 自定义ElasticsearchRepository
 *
 * @author 钱丁君-chandler 2020/3/8 4:42 PM
 * @since 1.8
 */
@NoRepositoryBean
public interface CustomElasticsearchRepository<T, ID> extends ReactiveElasticsearchRepository<T, ID> {
    @Query("{ \"bool\" : { \"must\" : { \"term\" : { \"useName\" : \"?0\" } } } }")
    Flux<T> findByUsename(String name);
}
