package com.example2.demo2;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {
    @Autowired
    Person person;

   //记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {

        logger.trace("这是trace");
        logger.debug("这是debug日志");
        //Springboot 默认级别  由低到高、
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");

    }

}
