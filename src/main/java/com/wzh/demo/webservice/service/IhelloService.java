package com.wzh.demo.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @desc: 测试发布的websercice服务
 * @author: wzh
 * @date: 2019年3月31日
 */
@WebService
@SOAPBinding(style=Style.RPC)
public interface IhelloService {
	
	/**
	 * @desc: 测试发布的websercice接口
	 * @author: wzh
	 * @date: 2019年3月31日
	 * @param message
	 * @return
	 */
	@WebMethod
	public String helloWebService(@WebParam(name="msg")String message);

}
