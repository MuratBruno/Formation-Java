package rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("webresources")
public class AppConfig extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> classesWS=new HashSet<>();
		classesWS.add(UserRS.class);
		return classesWS;
	}

}
