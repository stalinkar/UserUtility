package webapp.service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64;

public class EncodeDecodeService {
	
	private String strResult; 

	public String EncodeOrDecodeString(String strText, String strCategory, String Subcategory) {
		if (strCategory.equalsIgnoreCase("Encode")) {
			if (Subcategory.equalsIgnoreCase("Base64")) {
				strResult = this.encodeBase64(strText);
			}else if (Subcategory.equalsIgnoreCase("Base64Url")) {
				strResult = this.encodeBase64Url(strText);
			} else {
				try {
					strResult = this.encodeUrl(strText);
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			if (Subcategory.equalsIgnoreCase("Base64")) {
				strResult = this.decodeBase64(strText);
			}else if (Subcategory.equalsIgnoreCase("Base64Url")) {
				strResult = this.decodeBase64Url(strText);
			} else {
				try {
					strResult = this.decodeUrl(strText);
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return strResult;
	}

	public String encodeBase64(String strText) {
		Base64.Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(strText.getBytes());
	}

	public String decodeBase64(String strEncodedText) {
		Base64.Decoder decoder = Base64.getDecoder();
		return new String(decoder.decode(strEncodedText));
	}

	public String encodeBase64Url(String strURL) {
		return Base64.getUrlEncoder().encodeToString(strURL.getBytes());
	}

	public String decodeBase64Url(String strEncodedURL) {
		return new String(Base64.getUrlDecoder().decode(strEncodedURL));
	}

	public String encodeUrl(String strURL) throws UnsupportedEncodingException {
		return URLEncoder.encode(strURL, "UTF-8");
	}

	public String decodeUrl(String strEncodedURL) throws UnsupportedEncodingException {
		return URLDecoder.decode(strEncodedURL, "UTF-8");
	}
}
