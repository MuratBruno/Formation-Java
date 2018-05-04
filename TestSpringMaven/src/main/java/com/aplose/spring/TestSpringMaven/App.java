package com.aplose.spring.TestSpringMaven;


import java.time.Instant;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aplose.spring.Hello.IMessageService;
import com.aplose.spring.app.AfterReturning;
import com.aplose.spring.app.AnnotationInjection;
import com.aplose.spring.app.AutowiredInjection;
import com.aplose.spring.app.ConsoleWriter;
import com.aplose.spring.app.ConstructorInjection;
import com.aplose.spring.app.Dependency;
import com.aplose.spring.app.JCVDAware;
import com.aplose.spring.app.MyApp;
import com.aplose.spring.app.SetterInjection;
import com.aplose.spring.app.SetterInjectionFille;
import com.aplose.spring.app.User;
import com.aplose.spring.app.WriteBeforeAdvice;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
public class App {
    
	@Bean
	IMessageService mockMessageService() {
		return new IMessageService() {
			public String getMessage() {
				return "Hello World from mock Bean !";
			}
		};
	}
	
	public static void main( String[] args )    {
//		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml", App.class);
		
		JCVDAware jcvdAware = context.getBean("jcvdAware", JCVDAware.class);
		
		MessagePrinter mp = context.getBean(MessagePrinter.class);
		mp.printMessage();
		
		
		MyApp app2 = context.getBean("app2", MyApp.class);
		User admin = context.getBean("admin", User.class);
		User otherUser = app2.getUsers().get(0);
		
		if ( otherUser == admin ) {
			System.out.println("otherUser et admin sont bien la même instance... Bravo !");
		} else {
			System.out.println("Les deux admins sont différents !!!! ");
		}
		
		Dependency dependency = context.getBean("dependency", Dependency.class);
		Dependency otherDependency = context.getBean("dependency", Dependency.class);
		
		if (dependency == otherDependency) {
			System.out.println("Aïe... Les deux objets sont les mêmes...");
		} else {
			System.out.println("Nicuuuuuuu, c'est bien deux instances différentes");
		}
		
		ConstructorInjection ci = context.getBean("constructorInjection", ConstructorInjection.class);
		
		if ( ci != null ) {
			System.out.println("Toto est là ");
		}
		
		SetterInjection si = context.getBean("setterInjection", SetterInjection.class);
		
		if (si != null ) {
			System.out.println("Titi est làààààààààààààààààààààààààààààà...");
		}
		
		if (ci.getDep() == si.getDependency()) {
			System.out.println("ci.getDep() == si.getDep() : C'est dommage ça bro");
		} else {
			System.out.println("Ouf... c'est bien ça bro");
		}
		
		AutowiredInjection ai = context.getBean("autowiredInjection", AutowiredInjection.class);
		
		if ( ai.getDependency() == null ) {
			System.out.println("L'injection autowired n'a pas fonctionné");
		} else {
			System.out.println("L'injection autowired a fonctionné");
		}
		
		AnnotationInjection ai2 = context.getBean("annotationInjection", AnnotationInjection.class);
		
		if ( ai2.getDependency() == null ) {
			System.out.println("La configuration par annotation n'a pas fonctionné");
		} else {
			System.out.println("La configuration par annotation à fonctionné");
		}
		
		SetterInjectionFille sif = context.getBean("setterInjectionFille", SetterInjectionFille.class);
		
		Dependency d = sif.getDependency();
		String n = sif.getName();
		
		if ( d == null ) {
			System.out.println("L'héritage n'a pas marché, la configuration avec parent n'a pas fonctionné");
		} else {
			System.out.println("La configuration avec parent à fonctionné ! cher "+n);
		}
		
		ConsoleWriter targetConsoleWriter = context.getBean("consoleWriter", ConsoleWriter.class);
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new WriteBeforeAdvice());
		pf.addAdvice(new AfterReturning());
		pf.setTarget(targetConsoleWriter);
		ConsoleWriter proxyConsoleWriter = (ConsoleWriter)pf.getProxy();
		proxyConsoleWriter.write("Test de message avec proxy aop ! " + Instant.now());
		
		
		((AbstractApplicationContext)context).close();
		
		
	}

}