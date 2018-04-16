package com.aplose.smooss;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAction extends Action{
	
	@Override
	public Boolean execute(HttpServletRequest req, HttpServletResponse rep) {
		
		return true;
		
	}
	
}