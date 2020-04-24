package com.jzh.springbootjzh.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.jzh.springbootjzh.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/main")
    @ResponseBody
    public ModelAndView goIndex(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        List<Map<String,String>> resList = indexService.selectDh();
        JSONArray jsonArray= (JSONArray) JSONArray.toJSON(resList);
        String resJson = JSON.toJSONString(resList);
        System.out.println(resJson);
        mv.addObject("dhList",resJson);
        mv.addObject("dhList1",jsonArray);
        return mv;
    }
}
