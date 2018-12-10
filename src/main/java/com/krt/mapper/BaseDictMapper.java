package com.krt.mapper;

import com.krt.pojo.BaseDict;

import java.util.List;

/**
 * @author 匿名
 * @create 2018-12-10 9:17
 * @desc 字典数据表持久化接口
 **/
public interface BaseDictMapper {
    /**
     * 根据字典编码查询字典列表
     *
     * @return
     */
    List<BaseDict> getBaseDictById(String id);
}
