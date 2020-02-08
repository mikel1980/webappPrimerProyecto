package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaludoServlets
 */
@WebServlet("/SaludoServlets")
public class SaludoServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaludoServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   PrintWriter out = response.getWriter();
	   out.println("<html>");
	   out.println("<head><title>Hola mundo</title></head>");
	   out.println("<body>");
	   out.println("<h1>Hola Mundo</h1>");
	   out.println("<p>Request URI " + request.getRequestURI() + "</p>");
	   out.println("<p>Protocolo: " + request.getProtocol() + "</p>");
	   out.println("<p>Direccion remota: " + request.getRemoteAddr() + "</p>");
	   out.println("<p>Numero aleatorio: <strong>" + Math.random() + "</strong></p>");
	   out.println("</body></html>");
	   out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
