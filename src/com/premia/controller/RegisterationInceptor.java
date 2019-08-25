package com.premia.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RegisterationInceptor extends HandlerInterceptorAdapter {
	boolean abc=false;
	@Override
	public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object handler) throws IOException{
		if (abc){
		//if method returns false then all operation stops
		res.getWriter().write("it will stop here");
		return false;
		}
	return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest req,HttpServletResponse res,Object handler,ModelAndView modelview) throws IOException{
	
		//if method returns false then all operation stops
		System.out.println("it will called after spring mvc executes request handler method");
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest req,HttpServletResponse res,Object handler,Exception ex) throws IOException{
	
		//if method returns false then all operation stops
		System.out.println("it will called once view is created ");
		
	}
}
