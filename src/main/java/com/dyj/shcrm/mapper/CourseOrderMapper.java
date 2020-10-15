package com.dyj.shcrm.mapper;

import com.dyj.shcrm.model.CourserOrder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface CourseOrderMapper {
    public int findCountByMap(Map<String,Object> map);

    public List<CourserOrder> findListByMap(Map<String,Object> map);
}
