package ca.owenpeterson.website.config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@EnableWebMvc
@ComponentScan(basePackages = {"ca.owenpeterson.website.controllers"})
@Configuration
public class WebAppConfig implements WebMvcConfigurer
{
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) 
	{
		configurer.enable();
	}
	 
	@Bean
	public ViewResolver viewResolver() 
	{
      InternalResourceViewResolver bean = new InternalResourceViewResolver();
 
      bean.setViewClass(JstlView.class);
      bean.setPrefix("/WEB-INF/views/"); 
      return bean;
   }
	
	@Bean
    public TilesConfigurer tilesConfigurer() 
	{
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(
          new String[] { "/WEB-INF/views/**/*tiles.xml" });
        tilesConfigurer.setCheckRefresh(true);
         
        return tilesConfigurer;
    }
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) 
	{
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("WEB-INF/styles/**")
          .addResourceLocations("WEB-INF/styles/");
    }
}
