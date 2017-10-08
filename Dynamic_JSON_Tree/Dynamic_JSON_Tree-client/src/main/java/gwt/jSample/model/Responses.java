package gwt.jSample.model;

import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;

import gwt.jSample.util.JsonUtility;

public class Responses extends JavaScriptObject {

	protected Responses() {

	}

	public final Map<String, Status> getStatusMap() {
		Map<String, Status> statusMap = JsonUtility.toMap(JsonUtils.stringify(this));
		return statusMap;
	}
}
