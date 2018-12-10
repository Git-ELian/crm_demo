package com.krt.controller;

import com.krt.pojo.BaseDict;
import com.krt.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 匿名
 * @create 2018-12-07 11:34
 * @desc
 **/

@Controller
@RequestMapping("customer")
public class CustomerController {
    /**
     * 显示用户列表
     *
     * @return
     */
    @Autowired
    private BaseDictService dictService;

    @RequestMapping("/list")
    public String customer(Model model) {
        // 查询来源
        List<BaseDict> fromType = dictService.getBaseDictById("002");
        // 查询行业
        List<BaseDict> industryType = dictService.getBaseDictById("001");
        // 查询级别
        List<BaseDict> levelType = dictService.getBaseDictById("006");

        // 设置数据模型返回
        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);

        return "customer";
    }

    @RequestMapping("/tag")
    public String mytag() {
        return "myTag";
    }
}
