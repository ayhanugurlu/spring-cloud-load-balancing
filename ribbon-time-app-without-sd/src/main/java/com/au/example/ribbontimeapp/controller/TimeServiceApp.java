package com.au.example.ribbontimeapp.controller;

import com.au.example.ribbontimeapp.config.RibbonTimeConfig;
import com.fasterxml.jackson.annotation.JacksonInject;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

/**
 * Created by Ayhan.Ugurlu on 16/01/2018
 */
@RestController
@RibbonClient(name = "time-service",configuration = RibbonTimeConfig.class)
public class TimeServiceApp {

    @Inject
    private RestTemplate restTemplate;

    @GetMapping
    public String getTime(){
        return  restTemplate.getForEntity("http://time-service",String.class).getBody();
    }


}
