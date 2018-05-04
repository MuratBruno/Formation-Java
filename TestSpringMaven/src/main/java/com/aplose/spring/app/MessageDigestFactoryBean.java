package com.aplose.spring.app;

import java.security.MessageDigest;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageDigestFactoryBean implements FactoryBean<MessageDigest>, InitializingBean {

	private MessageDigest md5Digester;
	
	public void afterPropertiesSet() throws Exception {
		md5Digester = MessageDigest.getInstance("MD5");
	}

	public MessageDigest getObject() throws Exception {
		return md5Digester;
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

}
