package com.aplose.formationspringjava;

import com.aplose.formationspringjava.annotationdriven.DependencyAnnotation;
import com.aplose.formationspringjava.aop.ConsoleWriter;
import com.aplose.formationspringjava.aop.WriteAfterReturningAdvice;
import com.aplose.formationspringjava.aop.WriteBeforeAdvice;
import com.aplose.formationspringjava.autowire.AutowireInjection;
import com.aplose.formationspringjava.dao.IUserDAO;
import com.aplose.formationspringjava.inheritance.SetterInjection2;
import com.aplose.formationspringjava.lifecycle.SpringAware;
import com.aplose.formationspringjava.model.MyApp;
import com.aplose.formationspringjava.model.User;
import com.aplose.formationspringjava.tpinjection.ConstructorInjection;
import com.aplose.formationspringjava.tpinjection.SetterInjection;
import java.security.MessageDigest;
import java.util.List;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/aplose/resources/applicationContext.xml");
        System.out.println("Hello World! On va pouvoir commencer...");

        User admin = context.getBean("admin", User.class);
        MyApp app = context.getBean("app", MyApp.class);
        User otherAdmin = app.getUsers().get(0);
        if (admin == otherAdmin) {
            System.out.println("C'est bien un singleton...");
        }
        System.out.println("Bonjour " + admin.getFirstname() + " !");

        //TP Injection de dépendance par construteur et setter
        ConstructorInjection ci = context.getBean("constructorInjection", ConstructorInjection.class);
        SetterInjection si = context.getBean("setterInjection", SetterInjection.class);

        //vérification que l'on n'est pas sur des singletons...
        if (ci.getDependency() != si.getDependency()) {
            System.out.println("Ouf... Nous sommes bien sur des objets différents !");
        }
        
        //TP Injection automatique (autowire)
        AutowireInjection ai = context.getBean("autowireInjection",AutowireInjection.class);
        if(ai.getDependency()!=null){
            System.out.println("Ouf... Nous avons bien eu la dépendance directement injectée !");
        }
        
        //TP Configuration par annotation
        DependencyAnnotation da = context.getBean("dependencyAnnotation",DependencyAnnotation.class);
        System.out.println("Name de DependencyAnnotation : "+da.getName());
        if(da.getDependency()!=null){
            System.out.println("Ouf... Nous avons bien eu dependency injectée par annotation autowire");
        }

        //TP Inheritance
        SetterInjection2 si2 = context.getBean("setterInjection2", SetterInjection2.class);
        System.out.println("getName de setterInjection2 : "+ si2.getName());
        if(si2.getDependency()!=null){
            System.out.println("Dependency inherited successfully");
        }
        
        //TP SpringAware
        SpringAware sa = context.getBean("springAwareBean", SpringAware.class);
        System.out.println("Bean name of SpringAware : "+sa.getBeanName());
        System.out.println("Classloader : "+sa.getClassLoader().toString());
        System.out.println("ApplicationContext : "+sa.getAc().toString());
        
        //TP FactoryBean
        MessageDigest md = context.getBean("md5Digester", MessageDigest.class);
        String md5Code = new String(md.digest("Message à digérer".getBytes()));
        System.out.println("Signature MD5 de \"Message à digérer\" : "+md5Code);
        
        //TP AOP
        ConsoleWriter targetConsoleWriter = context.getBean("consoleWriter", ConsoleWriter.class);
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new WriteBeforeAdvice());
        pf.addAdvice(new WriteAfterReturningAdvice());
        pf.setTarget(targetConsoleWriter);
        ConsoleWriter proxyConsoleWriter  = (ConsoleWriter)pf.getProxy();
        proxyConsoleWriter.write("Test de message avec proxy aop !");
        
        //TP JDBC
        IUserDAO userDao = context.getBean("userDao", IUserDAO.class);
        User user1=new User();
        user1.setFirstname("Olivier");
        user1.setLastname("Andrade");
        user1.setLogin("oandrade");
        user1.setPwd("pwd1");
        User user2=new User();
        user2.setFirstname("Bill");
        user2.setLastname("Buffalo");
        user2.setLogin("bbuffalo");
        user2.setPwd("pwd2");
        User user3=new User();
        user3.setFirstname("John");
        user3.setLastname("Doeuf");
        user3.setLogin("jdoeuf");
        user3.setPwd("pwd3");
        //on les persiste
        userDao.create(user1);
        userDao.create(user2);
        userDao.create(user3);
        //test find all
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println("User : "+user.getId()+" "+user.getLogin());
        }
        
        context.close();

        
     }
}
