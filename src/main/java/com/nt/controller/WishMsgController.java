package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WishMsgController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Hiiiiii...");
		return new ModelAndView("welcome","msg","Welcome to gaju,murali,shrikant,amit,Chandrashekhar to Spring MVC.........");
	}

}
