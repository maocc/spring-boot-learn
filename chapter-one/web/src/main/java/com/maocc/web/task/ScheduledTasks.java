package com.maocc.web.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author maocc
 * @description
 * @date: 2018/5/8 16:33
 */
@Component
public class ScheduledTasks {

	 private static Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//	@Scheduled(cron="*/5 * * * * *")
	@Scheduled(fixedRate = 150000)
	public void reportCurrentTime() {
		logger.info("现在时间：" + dateFormat.format(new Date()));
	}
}
