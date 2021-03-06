package com.dyj.shcrm.web.controller;

import com.dyj.shcrm.mapper.CourseOrderMapper;
import com.dyj.shcrm.model.CourserOrder;
import com.dyj.shcrm.model.CurdResult;
import com.dyj.shcrm.model.PageResult;
import com.dyj.shcrm.service.ICourseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/add")
    public String add(){
        return "courseorder/add";
    }

    @RequestMapping("/save")
    @ResponseBody
    public CurdResult  save(CourserOrder order){
        CurdResult result =new CurdResult();
//        System.out.println(order);
        try {
            iCourseOrder.save(order);

            return result;
        }catch (Exception e) {

            result.setMsg("新增失败");
            result.setSuccess(0);
            return result;
        }
    }

    @RequestMapping("/listJson")
    @ResponseBody
    /**
     * page显示页数
     * limit 显示条数
     *
     */
    public PageResult<CourserOrder> listJson(int page,int limit){
        PageResult<CourserOrder> result =iCourseOrder.findPageResult(null,page,limit);
        return result;
    }
    @RequestMapping("/detail")
    public String detail(Model model,String order_id){

        CourserOrder order = iCourseOrder.findByOrderId(order_id);
        model.addAttribute("order",order);
        return "courseorder/datail";
    }
    @RequestMapping("/delete")
    @ResponseBody
    public CurdResult  delete(String order_id){
        CurdResult result =new CurdResult();
//        System.out.println(order);
        try {
            iCourseOrder.delete(order_id);
            return result;
        }catch (Exception e) {
            result.setMsg("删除失败");
            result.setSuccess(0);
            return result;
        }
    }

}
