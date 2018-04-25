package com.aplose.smooss.ws;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// On utilise soit le premier en important ApplicationPath avant ou le deuxième en donnant le chemin en dur

@ApplicationPath("ws")
// @javax.ws.rs.ApplicationPath("ws")
public class ApplicationConfig extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add(UserREST.class);
		return resources;
	}
}