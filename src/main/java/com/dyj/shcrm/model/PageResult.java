package com.dyj.shcrm.model;

import java.util.List;

public class PageResult<T> {

    private Integer code;//0成功,1失败
    private String msg;//失败信息
    private Integer count;//总记录数
    private List<T> data;

    public PageResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
