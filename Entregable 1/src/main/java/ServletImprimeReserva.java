

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Point;
import java.awt.font.TextAttribute;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletImprimeReserva
 */
public class ServletImprimeReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletImprimeReserva() {
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
		OutputStream outputStream = response.getOutputStream();
		 BufferedImage image = new BufferedImage(700, 400, BufferedImage.TYPE_INT_BGR);
		 Graphics2D graphics = image.createGraphics();
		 graphics.setBackground(Color.WHITE);
		 graphics.clearRect(0, 0, 700,400);
		 graphics.setFont(new Font("TimesRoman", Font.BOLD, 30));
		 graphics.setColor(Color.DARK_GRAY);
		 graphics.drawString(String.valueOf(getServletContext().getAttribute("nomyapel")), 30, 40);
		 graphics.drawString("Actividad reservada: "+getServletContext().getAttribute("act"), 30, 80);
		 BufferedImage img = ImageIO.read(this.getServletContext().getResourceAsStream("/WEB-INF/logoreserva_enblanco.jpg")); 
		 graphics.drawImage(img, 20, 95, null, null);
		 javax.imageio.ImageIO.write(image, "png", outputStream);
		 outputStream.close();
		
		
		 
		
		doGet(request, response);
	}

}
