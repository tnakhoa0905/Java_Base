package org.o7planning.hellospringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.o7planning.hellospringmvc.dao.Connect;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView hello(Model model, HttpSession session, HttpServletRequest request) {
       try {
    	   if(request.getParameter("btn1")!=null) {
   	    	session.setAttribute("Khoa", "handsome");
   	    	String[] ds = {"khoa","dep"};
   	    	session.setAttribute("ds", ds);
   	        model.addAttribute("greeting", "Hello Spring MVC");
       	}
    	   Connect cn = new Connect();
    	   cn.KetNoi();
           return new ModelAndView("helloworld");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return null;
	}
    	
       
    }
}