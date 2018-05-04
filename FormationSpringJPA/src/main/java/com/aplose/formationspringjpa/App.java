package com.aplose.formationspringjpa;

import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:appContext.xml");
        ctx.refresh();
        UserManager uManager = ctx.getBean("userManager", UserManager.class);

        User u = new User();
        u.setFirstname("Olivier");
        u.setLastname("Andrade");
        u.setLogin("oandrade@aplose.fr");
        u.setPwd("pwd");
        uManager.save(u);
        System.out.println("USER ID : "+u.getId());
        u.setPwd("TOTO");
        uManager.save(u);
        
        List<User> users = uManager.findAll();
        for (User user : users) {
            System.out.println("User : " + user.getFirstname() + " " + user.getLastname());
        }
        
        //TP Validation
        User u2 = new User();
        u2.setFirstname(null);
        u2.setLogin(null);
        u2.setPwd(null);
        UserManagerValidationImpl validateUser = ctx.getBean("userManagerValidationImpl", 
                UserManagerValidationImpl.class);
        Set<ConstraintViolation<User>> set = validateUser.validateUser(u2);
        for (ConstraintViolation<User> constraintViolation : set) {
            System.out.println(constraintViolation.getMessage());
        }
            
        
        
        

    }
}
