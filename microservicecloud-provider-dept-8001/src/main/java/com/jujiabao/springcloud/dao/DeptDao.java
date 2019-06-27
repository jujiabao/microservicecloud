package com.jujiabao.springcloud.dao;

import com.jujiabao.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title DeptDao
 * @ProjectName microservicecloud
 * @Description 描述一下吧
 * @Author Hello.Ju
 * @Date 2019-06-26 21:38
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
