package org.o7planning.hellospringmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.o7planning.hellospringmvc.bean.KhachHangbean;
import org.o7planning.hellospringmvc.bo.KhachHangbo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KTDNController {

    @RequestMapping("/login")
    public ModelAndView Login(Model model, HttpSession session, HttpServletRequest request) {
    	
    	try {
    		String un=request.getParameter("user");
        	String pass=request.getParameter("pass");
        	if(un==null)
        		 return new ModelAndView("login");
        	else {
        		KhachHangbo khbo= new KhachHangbo();
        		KhachHangbean kh=khbo.ktdn(un, pass);
        		if(kh!=null) {
        			session.setAttribute("kh", kh);
        			return new ModelAndView("redirect:/hello");
        		}else {
        			request.setAttribute("tb", "dns");
        			return new ModelAndView("login");
        		}
	}
		} catch (Exception e) {
			e.printStackTrace();return null;
		}
       
    }
}