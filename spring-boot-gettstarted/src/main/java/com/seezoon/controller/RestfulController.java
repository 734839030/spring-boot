package com.seezoon.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seezoon.entity.User;
import com.seezoon.service.IndexService;

@RestController
@RequestMapping(value="/index")
public class RestfulController {

	private static final Logger logger = LoggerFactory.getLogger(RestfulController.class);
	
	@Autowired
	private IndexService indexService;
	@Value(value="${my.secret}${boot.des}")
	private String random;
	@RequestMapping(value="")
	public String index(){
		return "hello word";
	}
	@RequestMapping("/get-map")
	public Map<String,String> get(@RequestParam String name){
		logger.debug("d=================");
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", name);
		map.put("random", random);
		return map;
	}
	@RequestMapping("/get-user")
	public User getUser(){
		return indexService.getUser();
	}
}
