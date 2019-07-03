package com.jujiabao.springcloud.controller;

import com.jujiabao.springcloud.entities.Dept;
import com.jujiabao.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Title DeptController_Consumer
 * @ProjectName microservicecloud
 * @Description 消费者controller层
 * @Author Hello.Ju
 * @Date 2019-06-26 22:12
 */
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;//面向接口编程

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept) {
        return this.service.add(dept);
    }

}
