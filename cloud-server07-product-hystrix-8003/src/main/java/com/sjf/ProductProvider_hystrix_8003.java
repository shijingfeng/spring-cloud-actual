package com.sjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 * @creation 2020/3/14 11:30
 * @author sjf
 */
@EnableHystrix //开启 Hystrix 熔断机制的支持
@EnableEurekaClient
@SpringBootApplication
@Configuration
@ComponentScan({"com.sjf"})
public class ProductProvider_hystrix_8003 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_hystrix_8003.class, args);
    }

}
