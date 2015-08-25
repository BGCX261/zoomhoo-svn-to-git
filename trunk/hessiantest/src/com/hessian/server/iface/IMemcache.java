package com.hessian.server.iface;

import java.util.Date;

/**
 * ��˵��

 * @author  DengRongfu
 * @version V1.0  ����ʱ�䣺Dec 4, 2009 2:39:12 PM
 * @company ctoshop
 */
public interface IMemcache
{

	void buildCache(String key,Object value);
	void buildCache(String key,Object value,Date expiry);
	boolean replace(String key, Object value);
	boolean replace(String key, Object value, Date expiry);
	void output(String key);
	
}
 