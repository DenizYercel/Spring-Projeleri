package com.deniz.databinding;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnketController {
	
	/* @Autowired
	private ApplicationContext  appContext;
	
	
	private Anket anket; */

	@RequestMapping("/survey")
	public String showAnket(Model model) {
	/*	anket=appContext.getBean("anket",Anket.class);
		model.addAttribute("anket",anket); */
		
		model.addAttribute("anket",new Anket());
		return "anket1";
	}
	
	
	@RequestMapping("/survey2")
	public String showAnket2(Model model,@ModelAttribute("anket") Anket anketsayfa1) {
	
	/*	anket.setFirstName(anketsayfa1.getFirstName());
		anket.setLastName(anketsayfa1.getLastName());
		anket.setDepartment(anketsayfa1.getDepartment());
		anket.setGender(anketsayfa1.getGender());
		anket.setSideBenefits(anketsayfa1.getSideBenefits()); */
		
		model.addAttribute("anket",anketsayfa1);
		
		
		
		return "anket2";
	}

	
	@RequestMapping("/sonuc")
	public String saveSurvey(Model model,@ModelAttribute("anket")Anket survey2) {
		
		
		model.addAttribute("anket",survey2);
		
		return "sonuc";
	}
	
}
