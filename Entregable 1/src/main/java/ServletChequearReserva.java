

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletChequearReserva
 */
public class ServletChequearReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletChequearReserva() {
        super();
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
		
		
		
		String cupos=String.valueOf(request.getParameter("actividades"));
	
		
		Integer cantidad=(Integer)getServletContext().getAttribute(cupos);
	

		
		if(cantidad>0) {
			Integer cantidad2=(cantidad-1);
			
			getServletContext().removeAttribute(cupos);
			getServletContext().setAttribute(cupos, cantidad2);
			getServletContext().setAttribute("act", cupos);
			Integer hola=(Integer)getServletContext().getAttribute(cupos);
			System.out.println(hola);
			RequestDispatcher dispatcher = request.getRequestDispatcher("ServletImprimeReserva");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("formuReserva.jsp");
		}
	}

}
