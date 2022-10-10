

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletLogin
 */
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Usuario>usuarios;
	
	String nomyapel="";
	
	public void init() {
		getServletContext().setAttribute("GAP", 3);
		getServletContext().setAttribute("BodyPump", 3);
		getServletContext().setAttribute("Streatching", 3);
		getServletContext().setAttribute("Musculación", 3);
		getServletContext().setAttribute("CrossFit", 3);
		usuarios=new ArrayList<Usuario>();
		usuarios.add(new Usuario("pepe@gmail.com","123","Pablo","Fernandez"));
		usuarios.add(new Usuario("juan@gmail.com","123","Juan","Rodriguez"));
		usuarios.add(new Usuario("jose@gmail.com","123","Jose","Gomez"));
	}

    /**
     * Default constructor. 
     */
    public ServletLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Usuario usuario=this.validar(request.getParameter("email"), request.getParameter(("clave")));
		if(usuario != null) {
			
			
			
			getServletContext().setAttribute("nomyapel", nomyapel);
				
				RequestDispatcher rd = request.getRequestDispatcher("formuReserva.jsp");
				rd.forward(request,response);
				
			} else {
				response.sendRedirect("login.html");
			}
		}			
		
	private Usuario validar(String param1, String param2) {
		for(Usuario user: usuarios) {
			if(user.getEmail().equals(param1) && user.getClave().equals(param2)) 
				nomyapel=user.getNombre()+" "+user.getApellido();
				return user;
			}
		
			return null;
		}

}
