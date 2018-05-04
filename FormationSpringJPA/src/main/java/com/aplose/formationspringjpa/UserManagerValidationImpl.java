/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjpa;

import java.util.HashSet;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author oandrade
 */
@Component
public class UserManagerValidationImpl {
    @Autowired
    private Validator validator;
    public Set<ConstraintViolation<User>> validateUser(User user) {
        return validator.validate(user);
    }
}
