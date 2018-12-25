package com.custom.logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.custom.service.LogTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerApplicationTests {
    @Autowired
    private LogTest logTest;
    @Test
    public void contextLoads() {
        logTest.login();
    }

}

