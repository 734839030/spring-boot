package com.seezoon.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.seezoon.entity.User;

@Service
public class IndexService {

	public User getUser(){
		return new User("123", "还登峰", new Date(), 12);
	}
}
