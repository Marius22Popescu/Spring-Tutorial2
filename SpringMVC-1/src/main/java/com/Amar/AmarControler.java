package com.Amar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AmarControler {
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping("/abc")
	public String call(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "Amar";
	}

}
