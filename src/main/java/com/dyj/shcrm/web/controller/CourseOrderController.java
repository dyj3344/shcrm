package com.dyj.shcrm.web.controller;

import com.dyj.shcrm.model.CourserOrder;
import com.dyj.shcrm.model.PageResult;
import com.dyj.shcrm.service.ICourseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseOrderController {

    @Autowired
    ICourseOrder iCourseOrder;
    @RequestMapping("/course")
    public String index(){
        return "courseorder/list";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public PageResult<CourserOrder> listJson(){
        PageResult<CourserOrder> result =iCourseOrder.findPageResult(null,1,8);
        return result;
    }
}
