package com.jujiabao.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Title ConfigBeans
 * @ProjectName microservicecloud
 * @Description 描述一下吧
 * @Author Hello.Ju
 * @Date 2019-06-26 22:06
 */
@Configuration
public class ConfigBeans {

    /**
     * 注入RestTemplate的bean
     * @return
     */
    @Bean
    @LoadBalanced//开启负载均衡-ribbon，基于客户端的负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //return new RoundRobinRule();//默认，轮询负载均衡
        return new RandomRule();//轮询负载均衡算法
    }

}
