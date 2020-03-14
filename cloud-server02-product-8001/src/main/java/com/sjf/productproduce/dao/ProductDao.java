package com.sjf.productproduce.dao;

import com.sjf.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *    product dao层
 * </p>
 * @creation 2020/3/14 11:06
 * @author sjf
 */
@Mapper //或者在启动类上标识 @MapperScan
public interface ProductDao {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}