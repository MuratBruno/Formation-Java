package com.aplose.smooss;

import javax.servlet.http.HttpServletRequest;

public abstract class Action {
	
	public abstract String execute(HttpServletRequest req,HttpServletRequest rep);
	
	

}