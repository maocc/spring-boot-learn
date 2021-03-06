package com.maocc.redis.domain;

import java.io.Serializable;

/**
 * @author maocc
 * @description
 * @date: 2018/5/8 10:34
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1326591267753374694L;
	private String username;
	private Integer age;

	public User() {
	}

	public User(String username, Integer age) {
		this.username = username;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
