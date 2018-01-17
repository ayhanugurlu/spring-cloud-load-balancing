package com.au.example.ribbontimeapp.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ayhan.Ugurlu on 17/01/2018
 */
@Configuration
public class RibbonTimeConfig {

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
