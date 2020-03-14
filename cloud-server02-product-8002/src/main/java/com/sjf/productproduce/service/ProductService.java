package com.sjf.productproduce.service;


import com.sjf.Product;

import java.util.List;

/**
 * <p>
 *    商品service接口类
 * </p>
 * @creation 2020/3/14 11:25
 * @author sjf
 */

public interface  ProductService {
    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
