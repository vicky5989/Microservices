package com.microserv.camel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
}
}
