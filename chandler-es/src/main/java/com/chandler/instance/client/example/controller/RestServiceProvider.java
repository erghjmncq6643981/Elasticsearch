package com.chandler.instance.client.example.controller;

import com.chandler.instance.client.example.document.Book;
import com.chandler.instance.client.example.entity.BookRequest;
import com.chandler.instance.client.example.entity.Person;
import com.chandler.instance.client.example.service.BookService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import java.util.Optional;

/**
 * restful风格的接口
 *
 * @author 钱丁君-chandler 2019/5/17下午2:00
 * @since 1.8
 */
@Api( tags = "服务调用者Demo接口")
@RestController
@Slf4j
public class RestServiceProvider {

    @Autowired
    private BookService bookService;

    /**
     * @param [id]
     * @return com.chandler.instance.client.example.document.Book
     * @Description: 根据序号精确查询book
     *
     * @Author chandler
     * @create 2019-10-13 16:18
     */
    @ApiOperation(value = "根据序号查询文档")
    @RequestMapping(value = "/book/search", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public Book postPerson(@ApiParam(value = "序号", required = true, defaultValue = "1") @RequestParam("id") String id) {
        Optional<Book> optional=bookService.findById(id);
        Book book=optional.get();
        log.info(book.toString());
        return book;
    }

    /**
     * @param [request]
     * @return java.lang.String
     * @Description: 将book对象写入到ES中
     *
     * @Author chandler
     * @create 2019-10-13 16:25
     */
    @ApiOperation(value = "新建文档")
    @RequestMapping(value = "/book/save", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public String postPerson(@RequestBody BookRequest request) {
        Book book=new Book(request);
        log.info(book.toString());
        bookService.save(book);
        return "success";
    }
}
