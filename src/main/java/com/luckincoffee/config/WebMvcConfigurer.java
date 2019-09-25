package com.luckincoffee.config;

import com.luckincoffee.interceptor.LoginInterceptor;
import com.luckincoffee.interceptor.OtherInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: yongzhe.dong@luckincoffee.com
 * @Date: 2019/9/25 22:23
 * @Description: ${description}
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    @Bean
    public LoginInterceptor getLoginIntercepter() {
        return new LoginInterceptor();
    }
    @Bean
    public OtherInterceptor getOtherIntercepter() {
        return new OtherInterceptor();
    }

    @Override
        public void addInterceptors(InterceptorRegistry registry){
            registry.addInterceptor(getLoginIntercepter())
                    .addPathPatterns("/**");
            registry.addInterceptor(getOtherIntercepter())
                .addPathPatterns("/**");
        }
}
