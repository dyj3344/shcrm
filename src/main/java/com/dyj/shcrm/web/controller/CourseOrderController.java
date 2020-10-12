package com.dyj.shcrm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseOrderController {

    @RequestMapping("/course")
    public String index(){
        return "courseorder/list";
    }
}
