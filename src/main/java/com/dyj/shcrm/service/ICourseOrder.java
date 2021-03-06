package com.dyj.shcrm.service;

import com.dyj.shcrm.model.CourserOrder;
import com.dyj.shcrm.model.PageResult;

public interface ICourseOrder {
    public PageResult<CourserOrder> findPageResult(CourserOrder condition, int page, int pagesize);

    public void save(CourserOrder cust);

    CourserOrder findByOrderId(String order_id);

    void delete(String order_id);
}
