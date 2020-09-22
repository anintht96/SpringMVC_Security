package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = {"/login","/"},method=RequestMethod.GET)
	public ModelAndView login(@RequestParam(name = "error",required = false) final String error) {
		if(error!=null) {
			return new ModelAndView("login", "message", "Login Failded!");
		}
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/admin",method=RequestMethod.GET)
	public String admin() {
		return "admin";
	}
	
	@RequestMapping(value = "/logout",method=RequestMethod.GET)
	public ModelAndView logout() {
		return new ModelAndView("login", "message", "Logged Out!");
	}
}
