package com.xworkz.fruit.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class FruitController {

	public FruitController() {
		super();
		System.out.println("running from fruit controller");
	}

	@RequestMapping("/sign")
	public String signUp(@RequestParam("name") String name, @RequestParam("price") String price,
			@RequestParam("colour") String colour, Model model) {

		System.out.println("login method is running");

		System.out.println(name);
		System.out.println(price);
		System.out.println(colour);

		model.addAttribute("nameForPage", name);
		model.addAttribute("priceForPage", price);
		model.addAttribute("colourForName", colour);

		return "signin";
	}
}
