package webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.service.GeneratePasswordService;

/**
 * Servlet implementation class GeneratePasswordServlet
 */
@WebServlet("/GeneratePasswordServlet")
public class GeneratePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GeneratePasswordService objGeneratePwdService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneratePasswordServlet() {
    	objGeneratePwdService = new GeneratePasswordService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/gereratepassword.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("strPassword", objGeneratePwdService.passwordGen(request));
		request.getRequestDispatcher("/WEB-INF/views/gereratepassword.jsp").forward(request, response);
	}

}
