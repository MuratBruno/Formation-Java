package com.aplose.smooss.TestSpringMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aplose.smooss.hello.IMessageService;

@Component
public class MessagePrinter {

	private static IMessageService ms;
	
	@Autowired
	public MessagePrinter(IMessageService ms) {
		MessagePrinter.ms = ms;
	}
	
	public void printMessage() {
        System.out.println( ms.getMessage());
	}

}
