package com.dyj.shcrm.service.impl;

import com.dyj.shcrm.mapper.CourseOrderMapper;
import com.dyj.shcrm.model.CourserOrder;
import com.dyj.shcrm.model.PageResult;
import com.dyj.shcrm.service.ICourseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseOrderImpl implements ICourseOrder {

    @Autowired
    CourseOrderMapper courseOrderMapper;
    @Override
    public PageResult<CourserOrder> findPageResult(CourserOrder condition, int page, int pagesize) {
        PageResult<CourserOrder> result = new PageResult<CourserOrder>();
        Map<String,Object> map = new HashMap<String,Object>();
        result.setCode(0);
        //获取总记录数
        int totalCount = courseOrderMapper.findCountByMap(map);
        //获取查询的数据
        List<CourserOrder> list = courseOrderMapper.findListByMap(map);
        result.setCount(totalCount);
        result.setData(list);
        return result;
    }
}
