package com.aplose.smooss.TestSpringMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.aplose.smooss.hello.IMessageService;

@Configuration
@ComponentScan
public class App {
	@Bean
	IMessageService mockMessageService() {
		return new IMessageService() {
			public String getMessage() {
				return "Hello World from Mock Bean ! ";
			}
		};
	}

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		try {
			MessagePrinter mp = context.getBean(MessagePrinter.class);
			mp.printMessage();
		} finally {
			((AbstractApplicationContext) context).close();
		}
	}
}