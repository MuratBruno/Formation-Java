/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplose.formationspringjpa.validator;

import com.aplose.formationspringjpa.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author oandrade
 */
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return User.class.equals(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "login", "login.empty");
        ValidationUtils.rejectIfEmpty(errors, "pwd", "pwd.empty");
    }
}
