package com.aplose.spring.app;

public class SetterInjection {
	private Dependency dependency;
	
	public void setDependency(Dependency d) {
		this.dependency = d;
	}

	public Dependency getDependency() {
		return dependency;
	}
}
