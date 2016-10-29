package com.seezoon.entity;

import java.util.Date;

public class User {

	private String id;
	private String name;
	private Date birth;
	private Integer age;
	
	public User() {
		super();
	}
	public User(String id, String name, Date birth, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
