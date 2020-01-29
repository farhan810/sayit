package com.sayit.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sayit.intercepter.RequestHeaderIntercepter;

public class MyConfig  extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		super.addInterceptors(registry);
		registry.addInterceptor(new RequestHeaderIntercepter()).addPathPatterns("/**");
		 
	}
}
