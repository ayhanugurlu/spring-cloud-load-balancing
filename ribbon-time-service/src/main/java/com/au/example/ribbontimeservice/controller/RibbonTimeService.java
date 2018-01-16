package com.au.example.ribbontimeservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Ayhan.Ugurlu on 16/01/2018
 */
@RestController
public class RibbonTimeService {

    @Value("${server.port}")
    String port;


    @GetMapping
    public String getTime(){
        return "Current time is "+new Date().toString()+ "(answered by port :)"+port;
    }
}
