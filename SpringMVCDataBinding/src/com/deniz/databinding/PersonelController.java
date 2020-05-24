package com.deniz.databinding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/personel")
public class PersonelController {

	@RequestMapping("/showform")
	public String showPersonel(Model model) {
		Personel personel =new Personel();
		personel.setFirstName("deniz");
		personel.setLastName("yercel");
		model.addAttribute("kisi",personel);
		return "personel-form";
	}
	
/*	@RequestMapping("/saveform")
	public String savePersonel(@RequestParam("firstName") String firstname,Model model) {
		
		model.addAttribute("firstName",firstname.toUpperCase());
		
		return "personel-confirm";
	}*/
	
	@RequestMapping("/saveform")
	public String savePersonel(@ModelAttribute("pers")Personel personel) {
		
		return "personel-confirm";
	}
	
}
