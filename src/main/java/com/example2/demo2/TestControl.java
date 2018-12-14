package com.example2.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hxq
 */
@RestController
public class TestControl {


    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String Test(){


        Person p = new Person();
        System.out.print(p.getLastName());

        return "hello world!";
    }
}
