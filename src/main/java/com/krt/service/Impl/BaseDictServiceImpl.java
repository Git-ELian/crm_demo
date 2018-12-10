package com.krt.service.Impl;

import com.krt.mapper.BaseDictMapper;
import com.krt.pojo.BaseDict;
import com.krt.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 匿名
 * @create 2018-12-10 9:47
 * @desc Service接口的实现类
 **/

@Service
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    private BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> getBaseDictById(String id) {
        return baseDictMapper.getBaseDictById(id);
    }
}
