package ca.owenpeterson.website.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import ca.owenpeterson.website.models.HomeModel;

@Controller
public class HomeController 
{
	@ModelAttribute("homeModel")
	public HomeModel getHomeModel()
	{
		HomeModel model = new HomeModel();
		LocalDateTime today = LocalDateTime.now();
		model.setDate(today);
		return model;
	}		
	
	@GetMapping("/")
	public ModelAndView getHome()
	{
		ModelAndView view = new ModelAndView("home/home.jsp");
		return view;
	}
}
