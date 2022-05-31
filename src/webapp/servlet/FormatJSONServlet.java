package webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.service.FormatJSONService;

/**
 * Servlet implementation class FormatJSONServlet
 */
@WebServlet("/FormatJSONServlet")
public class FormatJSONServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FormatJSONService objFormatJSONService;
	private String strJSONText;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormatJSONServlet() {
		objFormatJSONService = new FormatJSONService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/formatedJSON.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		strJSONText = request.getParameter("strJSON");
		request.setAttribute("strJSON", strJSONText);
		request.setAttribute("strFormatedJSON", objFormatJSONService.formatJSON(strJSONText));
		request.getRequestDispatcher("/WEB-INF/views/formatedJSON.jsp").forward(request, response);
	}

}
