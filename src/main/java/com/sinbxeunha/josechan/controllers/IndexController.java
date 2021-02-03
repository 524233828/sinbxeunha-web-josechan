package com.sinbxeunha.josechan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/config")
    @ResponseBody
    public String config(String data){
        return data;
    }
}
