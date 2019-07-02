package com.jujiabao.springcloud;

import com.jujiabao.rules.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Title DeptConsumer80_App
 * @ProjectName microservicecloud
 * @Description 描述一下吧
 * @Author Hello.Ju
 * @Date 2019-06-26 22:25
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
