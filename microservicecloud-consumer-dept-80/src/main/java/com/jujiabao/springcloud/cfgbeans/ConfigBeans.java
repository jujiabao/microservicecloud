package com.jujiabao.springcloud.cfgbeans;

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
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
