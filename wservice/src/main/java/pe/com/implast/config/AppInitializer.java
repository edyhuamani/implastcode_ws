package pe.com.implast.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;



public class AppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext)
			throws ServletException {
	
		
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
	    appContext.register(WebMvcConfiguration.class);
		
		//ServletRegistration.Dynamic registration=servletContext.addServlet("dispatcherServlet", DispatcherServlet.class);
	    ServletRegistration.Dynamic registration=servletContext.addServlet("dispatcherServlet", new DispatcherServlet(appContext));
	    registration.addMapping("/*");
		registration.setLoadOnStartup(1);
		
	}

	

}
