package com.deniz.validation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deniz.validation.Personel;
@Controller
@RequestMapping("/personel")
public class PersonelController {


		@RequestMapping(value="/showform")
		public String showPersonel(Model model) {
			Personel personel =new Personel();
			model.addAttribute("kisi",personel);
			return "personel-form";
		}
		
	/*	@RequestMapping("/saveform")
		public String savePersonel(@RequestParam("firstName") String firstname,Model model) {
			
			model.addAttribute("firstName",firstname.toUpperCase());
			
			return "personel-confirm";
		}*/
		
		// 3.adýmda @valid tagý
		@RequestMapping(value="/saveform")
		public String savePersonel(@Valid @ModelAttribute("kisi")Personel personel,BindingResult bindingResult) {
			
			if(bindingResult.hasErrors()) {
				return "personel-form";
			}
			else {
				return "personel-confirm";
			}
			
		}
		
}
