package com.hessian.client.simplehessian;

import java.net.MalformedURLException;
import java.util.HashMap;

import com.caucho.hessian.client.HessianConnectionException;
import com.caucho.hessian.client.HessianProxyFactory;
import com.hessian.server.entry.Car;
import com.hessian.server.exception.MyException;
import com.hessian.server.iface.IHello;

/**
 * @author liut
 * 
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String url = "http://192.168.1.10:8080/hessiantest/Hello";
		//String url = "http://10.4.116.43:8088/hessian_test/remoting/HessianRemoting";
		HessianProxyFactory factory = new HessianProxyFactory();
		try {
			IHello hello = (IHello) factory.create(IHello.class, url);
			System.out.println(hello.sayHello());
			HashMap map = hello.getHashMap();
			for (int i = 0; i < 10; i++) {
				System.out.println((String)map.get(Integer.toString(i)));
			}
	
			System.out.println(hello.login("root","root"));
						
			Car car = (Car) hello.getCar();
			System.out.println(car.getName() + ":" + car.getColor() + ":" + car.getLength());
			hello.testRuntimeException();
			hello.testMyException();
			//hello.testConnectException();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		} catch (HessianConnectionException e) {
			e.printStackTrace();
		} 
	}

}
