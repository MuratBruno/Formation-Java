package com.aplose.smooss;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action {

	@Override
	public Boolean execute(HttpServletRequest req, HttpServletResponse rep) {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		return email.equals("admin") && password.equals("admin");
	}

}
