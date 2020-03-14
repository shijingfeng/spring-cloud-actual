package com.sjf.productproduce.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sjf.Product;
import com.sjf.productproduce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *    商品restcontroller服务
 * </p>
 * @creation 2020/3/14 11:23
 * @author sjf
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    //fallbackMethod 指定当get方法出现异常时,将要调用的处理方法
    //处理方法的返回值和参数类型要一致
    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id) {
        return productService.get(id);
    }

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public List<Product> list() {
        return productService.list();
    }

    public Product getFallback(@PathVariable("id") Long id) {
        return new Product(id, "ID=" + id +"无效----@HystrixCommand",
                "无法找到对应数据库");
    }
}
