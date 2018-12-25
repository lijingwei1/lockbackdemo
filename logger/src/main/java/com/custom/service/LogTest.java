package com.custom.service;

import com.custom.logger.AppLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogTest {
    private static Logger logger = LoggerFactory.getLogger(LogTest.class);
    public void login(){
        AppLogger.dubeg("111111111111111111111111111111");
        AppLogger.info("222222222222222222222222222222");
        AppLogger.warn("333333333333333333333333333333");
        AppLogger.error("444444444444444444444444444444");
        logger.error("5555555555555555555555555555555");

    }
}
