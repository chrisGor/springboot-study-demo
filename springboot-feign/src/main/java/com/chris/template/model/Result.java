package com.chris.template.model;

import java.util.List;
import java.util.Map;

public class Result {

    private int code ;
    
    private String message;
    
    private List<Map> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Map> getData() {
        return data;
    }

    public void setData(List<Map> data) {
        this.data = data;
    }
    
    
}
