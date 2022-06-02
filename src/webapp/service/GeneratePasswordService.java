package webapp.service;

import java.security.SecureRandom;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class GeneratePasswordService extends HttpServlet {
	int maxLength;
	final String strUpperChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final String strLowerChar = "abcdefghijklmnopqrstuvwxyz";
	final String strNumChar = "1234567890";
	final String strSpecialChar = "@#$!^&.,%";
	SecureRandom random;
	StringBuilder sb;

	public String passwordGen(HttpServletRequest request) {
		maxLength = Integer.parseInt(request.getParameter("maxlen"));
		String strSplChar = request.getParameter("splchar");
		String strLower = request.getParameter("lower");
		String strUpper = request.getParameter("upper");
		String strNumeric = request.getParameter("num");
		System.out.println(maxLength+","+strSplChar+","+strLower+","+strUpper+","+strNumeric);
		String strFinalPassword = "";
		String strSupport = "";
		String StrTemp;

		random = new SecureRandom();
		if (strUpper == null && strLower == null && strNumeric == null && strSplChar == null) {
			strFinalPassword = strFinalPassword + strUpperChar + strLowerChar + strNumChar + strSpecialChar;
			strFinalPassword = this.ganerateRandomString(strFinalPassword);
		} else {
			if (strUpper != null) {
				StrTemp = this.ganerateRandomString(strUpperChar);
				strFinalPassword = strFinalPassword + StrTemp;
				strSupport = strSupport + StrTemp.substring(0, 1);
			}
			if (strLower != null) {
				StrTemp = this.ganerateRandomString(strLowerChar);
				strFinalPassword = strFinalPassword + StrTemp;
				strSupport = strSupport + StrTemp.substring(0, 1);
			}
			if (strNumeric != null) {
				StrTemp = this.ganerateRandomString(strNumChar);
				strFinalPassword = strFinalPassword + StrTemp;
				strSupport = strSupport + StrTemp.substring(0, 1);
			}
			if (strSplChar != null) {
				StrTemp = this.ganerateRandomString(strSpecialChar);
				strFinalPassword = strFinalPassword + StrTemp;
				strSupport = strSupport + StrTemp.substring(0, 1);
			}
			strFinalPassword = this.ganerateRandomString(strFinalPassword);
			strFinalPassword = strFinalPassword.substring(0, strFinalPassword.length()-strSupport.length())+strSupport;
		}

		return strFinalPassword;
	}

	public String ganerateRandomString(String strText) {
		sb = new StringBuilder();
		for (int i = 0; i <= maxLength - 1; i++) {
			int randomIndex = random.nextInt(strText.length());
			sb.append(strText.charAt(randomIndex));
		}
		return sb.toString();
	}

}