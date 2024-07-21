package com.emp.dep.entiyt;

import java.util.List;

public class MessageResponse {

    private String status;

    private String message;

    private List<EmployeeResponse> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<EmployeeResponse> getData() {
        return data;
    }

    public void setData(List<EmployeeResponse> data) {
        this.data = data;
    }
}
