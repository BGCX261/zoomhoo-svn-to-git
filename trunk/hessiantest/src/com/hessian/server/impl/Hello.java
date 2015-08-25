package com.hessian.server.impl;

import java.util.HashMap;

import com.caucho.hessian.client.HessianConnectionException;
import com.caucho.hessian.server.HessianServlet;
import com.hessian.server.entry.Car;
import com.hessian.server.exception.MyException;
import com.hessian.server.iface.IHello;

public class Hello extends HessianServlet implements IHello
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String sayHello()
	{
		return "Hello world,zoomhoo again!";
	}

	public HashMap getHashMap()
	{
		HashMap map = new HashMap();
		for (int i = 0; i < 10; i++)
		{
			map.put(Integer.toString(i), "Map:" + Integer.toString(i));
		}
		return map;
	}

	public String login(String userName, String pwd)
	{
		if (userName.equals("root") && pwd.equals("root"))
		{
			return "0";
		}
		else
			return "1";
	}

	public Car getCar()
	{
		Car car = new Car();
		car.setName("´óÖÚ");
		car.setColor("red");
		car.setLength("3");
		return car;
	}

	public void testMyException() throws MyException
	{
		throw new MyException();
	}

	public void testConnectException() throws HessianConnectionException
	{
		throw new HessianConnectionException();
	}

	public void testRuntimeException()
	{
		int code = 1 / 0;
	}
}
