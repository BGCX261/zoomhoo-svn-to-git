package com.hessian.server.iface;

import java.util.HashMap;

import com.caucho.hessian.client.HessianConnectionException;
import com.hessian.server.entry.Car;
import com.hessian.server.exception.MyException;

/**
 * @author liut
 * 
 */

public interface IHello {
	
	String sayHello();
	HashMap getHashMap();
	String login(String userName, String pwd);
	Car getCar();
	
	public void testMyException()throws MyException;
	
	public void testConnectException() throws HessianConnectionException;
	
	public void testRuntimeException();
}
