package com.krt.service;

import com.krt.pojo.BaseDict;

import java.util.List;

/**
 * @author 匿名
 * @create 2018-12-10 9:44
 * @desc 字典业务逻辑接口
 **/
public interface BaseDictService {

    /**
     * 根据字典编码查询字典列表
     *
     * @param id
     * @return
     */
    List<BaseDict> getBaseDictById(String id);
}
