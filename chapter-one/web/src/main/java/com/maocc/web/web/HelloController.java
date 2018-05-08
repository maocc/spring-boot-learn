package com.maocc.web.web;

import com.maocc.web.util.BlogProperties;
import com.maocc.web.util.MyException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.maocc.web.task.*;

import java.util.concurrent.Future;

/**
 * @author maocc
 * @description
 * @date: 2018/5/8 15:34
 */
@Controller
public class HelloController {
 private static Logger logger = LoggerFactory.getLogger(HelloController.class);
	@Autowired
	private BlogProperties blogProperties;

	@Autowired
	private Task task;

	@Autowired
	private FutureTask futureTask;

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}


	@ResponseBody
	@RequestMapping("/asytaskTime1")
	public String asytaskTime1() {
		long start = System.currentTimeMillis();
		try {
			task.doTaskOne();
			task.doTaskTwo();
			task.doTaskThree();
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		logger.info("任务全部完成，总耗时：" + (end - start) + "毫秒");
		return "asytaskTime1 return cost time ="+(end - start);
	}

	@ResponseBody
	@RequestMapping("/asytaskTime2")
	public String asytaskTime2() {
		long start = System.currentTimeMillis();
		Future<String> task1 = null;
		Future<String> task2 = null;
		Future<String> task3 = null;
		try {
			task1 = futureTask.doTaskOne();
			task2 = futureTask.doTaskTwo();
			task3 = futureTask.doTaskThree();
		} catch (Exception e) {
			e.printStackTrace();
		}

		while(true) {
			if(task1.isDone() && task2.isDone() && task3.isDone()) {
				// 三个任务都调用完成，退出循环等待
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();

		logger.info("任务全部完成，总耗时：" + (end - start) + "毫秒");

		return "asytaskTime2 return cost all time ="+(end - start);
	}


	@RequestMapping("/")
	public String index(ModelMap map) {
		map.addAttribute("host", "http://www.baidu.com | " + blogProperties.getName() + " | " + blogProperties.getAge() + " | " + blogProperties.getDesc());



		return "index";
	}

	@RequestMapping("/helloError")
	public String helloError() throws Exception {
		throw new Exception("发生错误");
	}

	@RequestMapping("/json")
	public String json() throws MyException {
		throw new MyException("发生错误2");
	}


}
