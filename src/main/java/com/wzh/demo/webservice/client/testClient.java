package com.wzh.demo.webservice.client;

import javax.xml.ws.BindingProvider;

/**
 * @desc: 测试连接用客户端test
 * @author: wzh
 * @date: 2019年3月31日
 */
public class testClient {
	
	public static void main(String[] args) {
		IhelloService service = new HelloServiceImplService().getHelloServiceImplPort();
		
		// 添加basc 认证
		BindingProvider bp = (BindingProvider) service;
		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "admin");
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "123456");
		
		System.out.println(service.helloWebService("测试一下"));
	}
}
