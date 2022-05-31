package webapp.service;

import java.security.SecureRandom;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class GeneratePasswordService extends HttpServlet {

	final String strUpperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final String strLowerChar = "abcdefghijklmnopqrstuvwxyz";
	final String strNumChar = "1234567890";
	final String strSpecialChar = "@#$!^&.,%";
	SecureRandom random;
	StringBuilder sb;

	public String passwordGen(HttpServletRequest request) {
		int maxLength = Integer.parseInt(request.getParameter("maxlen"));
		String strSplChar = request.getParameter("splchar");
		String strLower = request.getParameter("lower");
		String strUpper = request.getParameter("upper");
		String strNumeric = request.getParameter("num");
		
		String strFinalPassword = "";

		random = new SecureRandom();
		sb = new StringBuilder();
		if (strUpper==null && strLower==null && strNumeric==null && strSplChar==null) {
			strFinalPassword = strFinalPassword + strUpperChar + strLowerChar + strNumChar + strSpecialChar;
		} else {
			if (strUpper!=null) {
				strFinalPassword = strFinalPassword + strUpperChar;
			}
			if (strLower!=null) {
				strFinalPassword = strFinalPassword + strLowerChar;
			}
			if (strNumeric!=null) {
				strFinalPassword = strFinalPassword + strNumChar;
			}
			if (strSplChar!=null) {
				strFinalPassword = strFinalPassword + strSpecialChar;
			}
		}

		for (int i = 0; i <= maxLength - 1; i++) {
			int randomIndex = random.nextInt(strFinalPassword.length());
			sb.append(strFinalPassword.charAt(randomIndex));
		}

		return sb.toString();
	}

}