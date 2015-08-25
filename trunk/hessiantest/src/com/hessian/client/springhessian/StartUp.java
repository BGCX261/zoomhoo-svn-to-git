package com.hessian.client.springhessian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.hessian.server.iface.IHello;

/**
 * @author liut
 * 
 */
public class StartUp {
	public static FileSystemXmlApplicationContext context;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			// ApplicationContext context = new ClassPathXmlApplicationContext(
			// "WEB-INF\\conf\\remote-client.xml");

			String[] xml = new String[1];
			xml[0] = "WebRoot/WEB-INF/conf/remote-client.xml";

			context = new FileSystemXmlApplicationContext(xml);

			IHello hello = (IHello) context.getBean("myServiceClient");
			
			System.out.println(hello.sayHello());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
