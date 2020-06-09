package com.example.mybatisanddruid.controller;

import com.example.mybatisanddruid.mapper.MemberMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private MemberMapper memberMapper =null;

    @RequestMapping("/one")
    @ResponseBody
    public Map testdb(){
        return  memberMapper.findObjectById(1);
    }
}