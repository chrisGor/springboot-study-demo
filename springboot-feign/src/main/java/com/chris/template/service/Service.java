package com.chris.template.service;

import java.util.Map;

import com.chris.template.model.Result;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers({ "Accept: application/json", "Host: web" })
public interface Service {
    @RequestLine("GET /satinApi?type={type}&page={page}")
    @Headers("Content-Type: application/json")
    Result getStories(@Param("type") int type, @Param("page") int page);
    
    @RequestLine("GET /journalismApi")
    @Headers("Content-Type: application/json")
     Map getNew();

}
