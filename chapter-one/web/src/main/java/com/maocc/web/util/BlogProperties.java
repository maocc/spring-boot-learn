package com.maocc.web.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.math.BigDecimal;

/**
 * @author maocc
 * @description
 * @date: 2018/5/8 16:02
 */
@ConfigurationProperties(prefix = "com.maocc", ignoreUnknownFields = false)
public class BlogProperties {
	private String name;
	private int age;
	private String desc;
	private String value;
	private int number;
	private BigDecimal bignumber;
	private int test1;
	private int test2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public BigDecimal getBignumber() {
		return bignumber;
	}

	public void setBignumber(BigDecimal bignumber) {
		this.bignumber = bignumber;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public int getTest2() {
		return test2;
	}

	public void setTest2(int test2) {
		this.test2 = test2;
	}
}
