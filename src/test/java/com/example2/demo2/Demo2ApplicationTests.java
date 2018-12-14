package com.example2.demo2;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {
    @Autowired
    Person person;


    @Test
    public void contextLoads() {
        System.out.println("ces"+person.getLastName());
        System.out.println("ce2"+person.getDog().getName());

    }

}
