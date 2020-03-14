package com.sjf;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *    商品实体类
 * </p>
 * @creation 2020/3/14 10:41
 * @author sjf
 */
@Data
public class Product implements Serializable {

    private Long  pid;   //主键

    private String  productName;   //产品名称

    // 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String  dbSource;

    public Product(Long pid, String productName, String dbSource) {
        this.pid = pid;
        this.productName = productName;
        this.dbSource = dbSource;
    }
}
