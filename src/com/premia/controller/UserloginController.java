package com.premia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.premia.model.User;
import com.premia.service.UserService;

@Controller
public class UserloginController {

	@Autowired
	UserService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showForm() {
		System.out.println("loginController");

		User user = new User();
		ModelAndView model = new ModelAndView("login1", "user", user);
		return model;
		// return "/WEB-INF/login.jsp";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView updateForm(@ModelAttribute() User user, BindingResult result) {
		ModelAndView model = null;
		//boolean validornot = false ;//= service.validateUser(user);
		//boolean validornot = service.validateUser(user);
		boolean validornot=service.validateUserHiber(user); // using hibernate
		if (result.hasErrors()) {
			model = new ModelAndView("login1", "user", user);
		}
		if (validornot) {
			model = new ModelAndView("Loggedin", "User", user);
		} else {
			model = new ModelAndView("login1", "User", user);
		}
		return model;
	}

	@RequestMapping(value = "/userregister", method = RequestMethod.GET)
	public ModelAndView showRegiserForm() {
		System.out.println("at showRegiserForm");
		User userregister = new User();
		ModelAndView model = new ModelAndView("register", "userregister", userregister);
		return model;
	}

	@RequestMapping(value = "/userregister", method = RequestMethod.POST)
	public ModelAndView registerUser(@Valid @ModelAttribute("userregister") User user, BindingResult result) {
		ModelAndView model = null;
		if (result.hasErrors()) {
			model = new ModelAndView("register", "userregister", user);
			return model;
		}
		System.out.println("calling service");
		//service.createNewUser(user);
		//service.createNewUserHiber(user);
		System.out.println("after calling service");
		model = new ModelAndView("useraddsuccess", "userregister", user);
		return model;
	}
}