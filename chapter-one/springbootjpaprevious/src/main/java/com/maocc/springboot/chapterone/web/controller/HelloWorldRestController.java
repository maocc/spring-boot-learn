package com.maocc.springboot.chapterone.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maocc
 * @description
 * @date: 2018/4/27 16:20
 */
@RestController
public class HelloWorldRestController {


	@RequestMapping(value = "/sayHello")
	public String sayHello(){
		return "controller";
	}
}
