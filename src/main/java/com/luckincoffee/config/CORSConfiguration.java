package com.luckincoffee.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @Author: dyz
 * @Date: 2019/8/30 11:13
 * @Description: 解决前后端分离跨域问题
 */
@Configuration
public class CORSConfiguration extends WebMvcConfigurerAdapter {
    /**
     * 所有的请求都允许跨域
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}

