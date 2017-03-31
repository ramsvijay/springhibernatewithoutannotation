package com.controller;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.SimpleFormController;


import com.bean.registration;
import com.service.ServiceImpl;
import com.service.ServiceInf;


public class UpdateController extends SimpleFormController {


	ServiceInf service;

	public ServiceInf getService() {
		return service;
	}

	public void setService(ServiceInf service) {
		this.service = service;
	}

	protected ModelAndView onSubmit(Object command) throws ServletException
	{
       registration reg=(registration) command;
       String id=reg.getEmail();
		String result=service.update(reg);	
		ModelAndView model = new ModelAndView("success");
			return model.addObject("msg", result);
	}
	
	
}
