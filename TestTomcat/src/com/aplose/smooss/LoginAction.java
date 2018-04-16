package com.aplose.smooss;

import javax.servlet.http.HttpServletRequest;

public class LoginAction extends Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletRequest rep) {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		return null;
	}

}
