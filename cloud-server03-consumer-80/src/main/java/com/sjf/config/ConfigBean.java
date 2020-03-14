package com.sjf.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *
 * </p>
 * @creation 2020/3/14 11:38
 * @author sjf
 */
@Configuration //标识配置类
public class ConfigBean {

    ///@LoadBalanced表示这个RestTemplate开启负载均衡，在调用服务提供者的接口时，
    //可使用 服务名称 替代真实IP地址。服务名称 就是服务提供者在application.yml中
    //配置的spring.application.name属性的值。
    @LoadBalanced
    @Bean // 向容器中添加 RestTemplate 组件,直接通过此组件可调用 REST 接口
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
