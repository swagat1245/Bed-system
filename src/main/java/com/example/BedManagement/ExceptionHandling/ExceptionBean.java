package com.example.BedManagement.ExceptionHandling;

import java.util.Date;

public class ExceptionBean {
    private String msg;
    private Date date;
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
