package com.wzh.demo.webservice.service.impl;

import java.util.Date;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.apache.cxf.interceptor.InInterceptors;
import org.springframework.stereotype.Component;

import com.wzh.demo.webservice.service.IhelloService;

@InInterceptors(interceptors={"com.wzh.demo.webservice.interceptor.HelloAuthInterceptor"})// 添加拦截器
@WebService
@SOAPBinding(style=Style.RPC)
@Component
public class HelloServiceImpl implements IhelloService {

	@Override
	public String helloWebService(String message) {
		System.out.println(message);
		return "响应：" + new Date();
	}

}
