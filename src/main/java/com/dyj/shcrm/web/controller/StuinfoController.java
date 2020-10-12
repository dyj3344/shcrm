package com.dyj.shcrm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StuinfoController {
    @RequestMapping("/stuinfo")
    public String index(){
        return "stuinfo/list";
    }
}
