package com.hessian.server.entry;

/**
 * @author liut
 * 
 */
public class Car implements java.io.Serializable{

	String color;

	String length;

	String name;

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
