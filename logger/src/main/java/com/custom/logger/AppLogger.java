package com.custom.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class AppLogger {
    private static Logger logger = LoggerFactory.getLogger(AppLogger.class);

    public static void dubeg(String context){
        if(logger.isDebugEnabled()){
            logger.debug(context);
        }
    }
    public static void info(String context){
        logger.info(context);
    }
    public static void warn(String context){
        logger.warn(context);
    }
    public static void error(String context){
        logger.error(context);
    }
}
