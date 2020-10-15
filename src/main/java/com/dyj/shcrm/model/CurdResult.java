package com.dyj.shcrm.model;

public class CurdResult {
    private  Integer success=1;
    private String msg;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CurdResult(Integer success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public CurdResult() {
    }

    @Override
    public String toString() {
        return "CurdResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                '}';
    }
}
