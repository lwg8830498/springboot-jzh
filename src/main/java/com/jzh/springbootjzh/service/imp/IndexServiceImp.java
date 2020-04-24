package com.jzh.springbootjzh.service.imp;

import com.jzh.springbootjzh.mapper.IndexMapper;
import com.jzh.springbootjzh.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service(value = "indexService")
public class IndexServiceImp implements IndexService {

    @Resource
    private IndexMapper indexMapper;

    @Override
    public List<Map<String, String>> selectDh() {
        List<Map<String,String>> resList = indexMapper.selectDh();
        return resList;
    }
}
