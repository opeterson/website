package ca.owenpeterson.website.controllers;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import ca.owenpeterson.website.models.HomeModel;

@Controller
public class HomeController 
{
	private static final Logger LOGGER = LogManager.getLogger(HomeController.class);
	
	@ModelAttribute("homeModel")
	public HomeModel getHomeModel()
	{
		LOGGER.debug("Creating model for home page.");
		HomeModel model = new HomeModel();
		LocalDateTime today = LocalDateTime.now();
		model.setDate(today);
		LOGGER.debug("Returning model for home page.");
		return model;
	}		
	
	@GetMapping("/")
	public ModelAndView getHome()
	{
		LOGGER.debug("Handling request for home page.");
		ModelAndView view = new ModelAndView("homepage");
		LOGGER.debug("Returning view for home page.");
		return view;
	}
}
