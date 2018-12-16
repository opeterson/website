package ca.owenpeterson.website.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import ca.owenpeterson.website.models.HomeModel;

public class HomeControllerTest 
{
	private HomeController homeController = new HomeController();
	
	@Test
	public void testGetHome()
	{
		ModelAndView result = homeController.getHome();
		assertNotNull(result);
		assertEquals("homepage", result.getViewName());
	}
	
	@Test
	public void testGetHomeModel()
	{
		HomeModel model = homeController.getHomeModel();
		assertNotNull(model);
		assertNotNull(model.getDate());
		LocalDate today = LocalDate.now();
		LocalDate date = model.getDate().toLocalDate();
		assertEquals(today, date);		
	}
}
