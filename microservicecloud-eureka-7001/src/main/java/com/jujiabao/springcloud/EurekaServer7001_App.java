package com.jujiabao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title EurekaServer7001_App
 * @ProjectName microservicecloud
 * @Description 描述一下吧
 * @Author Hello.Ju
 * @Date 2019-06-27 22:44
 */
@SpringBootApplication
@EnableEurekaServer//表示该boot为eureka服务，接受其它的微服务注册进来
public class EurekaServer7001_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class, args);
    }
}
