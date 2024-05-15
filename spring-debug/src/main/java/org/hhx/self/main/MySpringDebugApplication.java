package org.hhx.self.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kai·yang
 * @Date 2023/3/17 10:22
 */
public class MySpringDebugApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		int beanDefinitionCount = context.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);
	}
}
