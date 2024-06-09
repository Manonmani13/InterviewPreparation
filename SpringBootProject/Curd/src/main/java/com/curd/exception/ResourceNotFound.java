package com.curd.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFound  extends  RuntimeException{
    public ResourceNotFound(String messge) {
        super(messge);
    }
}
