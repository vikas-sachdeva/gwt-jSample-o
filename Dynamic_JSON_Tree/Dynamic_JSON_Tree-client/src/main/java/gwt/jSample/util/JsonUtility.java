package gwt.jSample.util;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;

public class JsonUtility {

	public static <T> Map<String, T> toMap(String jsonStr) {
		Map<String, T> map = new HashMap<>();

		JSONValue parsed = JSONParser.parseStrict(jsonStr);
		JSONObject jsonObj = parsed.isObject();
		if (jsonObj != null) {
			for (String key : jsonObj.keySet()) {
				map.put(key, (T) JsonUtils.safeEval(jsonObj.get(key).toString()));
			}
		}

		return map;
	}

}
