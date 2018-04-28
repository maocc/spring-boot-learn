package com.maocc.springboot.chapterone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author maocc
 * @description
 * @date: 2018/4/27 16:20
 */
@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String index(ModelMap map) {
		// 加入一个属性，用来在模板中读取
		map.addAttribute("host", "http://www.baidu.com");
		// return模板文件的名称，对应src/main/resources/templates/index.html
		return "index";
	}
}
