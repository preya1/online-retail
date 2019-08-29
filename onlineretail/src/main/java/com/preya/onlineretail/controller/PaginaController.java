package com.preya.onlineretail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaginaController {

	@RequestMapping(value = {"/","/home","index}"})
	
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("pagina");
		mv.addObject("Salutare","Bine Ai Venit Pe Pagina - Spring MVC");
		return mv;
		
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam("Salutare")String Salutare) {
		ModelAndView mv = new ModelAndView("pagina");
		mv.addObject("Salutare","Bine Ai Venit Pe Pagina - Spring MVC");
		return mv;
	}
	
}
