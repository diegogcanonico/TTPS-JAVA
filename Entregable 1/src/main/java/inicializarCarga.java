

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class inicializarCarga
 *
 */
public class inicializarCarga implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public inicializarCarga() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	String actividades1 = sce.getServletContext().getInitParameter("actividades1");
    	String actividades2 = sce.getServletContext().getInitParameter("actividades2");
    	String actividades3 = sce.getServletContext().getInitParameter("actividades3");
    	String actividades4 = sce.getServletContext().getInitParameter("actividades4");
    	String actividades5 = sce.getServletContext().getInitParameter("actividades5");
    
    	
    	
    	// Se guardan en el contexto
    	ServletContext contexto = sce.getServletContext();
    	contexto.setAttribute("actividades1", actividades1);
    	contexto.setAttribute("actividades2", actividades2);
    	contexto.setAttribute("actividades3", actividades3);
    	contexto.setAttribute("actividades4", actividades4);
    	contexto.setAttribute("actividades5", actividades5);
    	
    	
    	
    	
   
    	
    	

    }
    
	
}
