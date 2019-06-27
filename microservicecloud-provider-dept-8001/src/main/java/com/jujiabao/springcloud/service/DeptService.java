package com.jujiabao.springcloud.service;

import com.jujiabao.springcloud.entities.Dept;

import java.util.List;

/**
 * @Title DeptService
 * @ProjectName microservicecloud
 * @Description 描述一下吧
 * @Author Hello.Ju
 * @Date 2019-06-26 21:45
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
