package com.yigong.student_innovation_base_api.config;

import com.yigong.student_innovation_base_api.interceptor.AuthenticationInterceptor;
import com.yigong.student_innovation_base_api.interceptor.CommonInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置拦截器
 * @author jinbin
 * @date 2017-08-05 12:23
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authenticationInterceptor())
                .addPathPatterns("/**");    // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
        registry.addInterceptor(commonInterceptor())
                .addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }
    @Bean
    public CommonInterceptor commonInterceptor() {
        return new CommonInterceptor();
    }
}
