package com.maocc.web.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.DateUtils;

import java.util.Random;

/**
 * @author maocc
 * @description
 * @date: 2018/5/8 17:00
 */
@Component
public class Task {
	public static Random random =new Random();
	private static Logger logger = LoggerFactory.getLogger(Task.class);

	@Async
	public void doTaskOne() throws Exception {
		logger.info("开始做任务一");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(2000));
		long end = System.currentTimeMillis();
		logger.info("完成任务一1，耗时：" + (end - start) + "毫秒");
	}
	@Async
	public void doTaskTwo() throws Exception {
		logger.info("开始做任务二");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(2000));
		long end = System.currentTimeMillis();
		logger.info("完成任务二1，耗时：" + (end - start) + "毫秒");
	}
	@Async
	public void doTaskThree() throws Exception {
		logger.info("开始做任务三");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(2000));
		long end = System.currentTimeMillis();
		logger.info("完成任务三1，耗时：" + (end - start) + "毫秒");
	}
}
