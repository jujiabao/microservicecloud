package com.jujiabao.rules;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title MySelfRule
 * @ProjectName microservicecloud
 * @Description 注意点：自定义ribbon的规则，注意不能放在@ComponentScan包以及子包下，会被共享规则，新建包就行
 * @Author Hello.Ju
 * @Date 2019-07-02 22:58
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        //return new RandomRule();// Ribbon默认是轮询，我自定义为随机
        //return new RoundRobinRule();// Ribbon默认是轮询，我自定义为随机

        return new RandomRule_ZY();// 我自定义为每台机器5次
    }
}
