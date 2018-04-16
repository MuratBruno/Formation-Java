package com.aplose.smooss;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action {
	
	public abstract Boolean execute(HttpServletRequest req,HttpServletResponse response);

}