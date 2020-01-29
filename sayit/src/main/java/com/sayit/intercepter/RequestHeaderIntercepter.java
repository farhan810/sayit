package com.sayit.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.http11.HeadersTooLargeException;
import org.apache.tomcat.util.codec.binary.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sayit.exceptions.InvalidHeaderFieldException;

@Component
public class RequestHeaderIntercepter  extends HandlerInterceptorAdapter{

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		 System.out.println("im pre.....");
		// request.getHeaders("student-auth-key");
		 if(request.getHeaders("student-auth-key") != null) {
			 
			 throw new InvalidHeaderFieldException("invalid Exception");
		 }
		return super.preHandle(request, response, handler);
		
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("im post.....");
		
		super.postHandle(request, response, handler, modelAndView);
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("im completed.....");
		super.afterCompletion(request, response, handler, ex);
	}
}
