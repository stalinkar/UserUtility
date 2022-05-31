package webapp.service;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FormatJSONService {
	JSONObject jsonObj;
	JSONArray jsonArray = new JSONArray();
	ObjectMapper ObjectMapper;
	public String formatJSON(String strJSON) {
		String strFormatedJSON = "N/A";
		ObjectMapper = new ObjectMapper();
		try {
			Object obj = ObjectMapper.readValue(strJSON,Object.class);
			strFormatedJSON = ObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return strFormatedJSON;
	}
}