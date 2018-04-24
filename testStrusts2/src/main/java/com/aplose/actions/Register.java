package com.aplose.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.aplose.Person;

public class Register extends ActionSupport {
    
    private static final long serialVersionUID = 1L;
    
    private Person personBean;


    public String execute() throws Exception {
        //call Service class to store personBean's state in database
        if (personBean != null) {
        	return Action.SUCCESS;
        }
        else {
        	return Action.ERROR;
        }

    }
    
    public Person getPersonBean() {
        return personBean;
    }
    
    public void setPersonBean(Person person) {
        personBean = person;
    }

}

