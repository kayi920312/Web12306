package com.test.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseDaoBeanSupport {
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring/applicationContext.xml");
	
	public Object getBean(String beanName){
		return ac.getBean(beanName);
	}
}
