package com.mashen.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mashen.service.UserServiceImp;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:applicationContext.xml"})  
public class SpringTest{  
    @Resource(name="userServiceImp")  
    private UserServiceImp userService; 
    @Test   
    public void testServie1(){  
    	userService.add();
    }
}  