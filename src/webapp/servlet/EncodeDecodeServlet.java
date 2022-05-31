package webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.service.EncodeDecodeService;

/**
 * Servlet implementation class EncodeDecodeServlet
 */
@WebServlet("/EncodeDecodeServlet")
public class EncodeDecodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EncodeDecodeService objEncodeDecodeService;
	private String strEncodeDecodeText;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EncodeDecodeServlet() {
        objEncodeDecodeService = new EncodeDecodeService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/views/encodedecode.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		strEncodeDecodeText = request.getParameter("strEncodeDecode");
		request.setAttribute("strText", strEncodeDecodeText);
		request.setAttribute("strEncodeDecode", objEncodeDecodeService.EncodeOrDecodeString(strEncodeDecodeText, request.getParameter("category"), request.getParameter("subcategory")));
		request.getRequestDispatcher("/WEB-INF/views/encodedecode.jsp").forward(request, response);
	}

}
