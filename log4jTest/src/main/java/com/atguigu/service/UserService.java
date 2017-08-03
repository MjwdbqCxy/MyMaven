package com.atguigu.service;

import org.apache.log4j.Logger;

public class UserService {

	private final static Logger logger = Logger.getLogger(UserService.class);
	public static void main(String[] args) {
		
		int age = 0;
		if (logger.isInfoEnabled()) {
			logger.info("main(String[]) - int age=" + age);
		}
		
		logger.info("userservice----info");
	}
}
