package com.atguigu.dao;

import org.apache.log4j.Logger;

public class UserDao {

	private static final Logger logger = Logger.getLogger(UserDao.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		logger.debug("hello 0316--------debug");
//		logger.info("hello 0316--------info");
//		logger.warn("hello 0316--------warn");
//		logger.error("hello 0316--------error");
		try {
			logger.debug("debug");
			int i = 10/0;
			logger.debug("debug");
		} catch (Exception e) {
			logger.error(e.getMessage(), e.getCause());
		}
	}

}
