package gwt.jSample.model;

import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;

import gwt.jSample.util.JsonUtility;

public class Paths extends JavaScriptObject {

	protected Paths() {

	}

	public final Map<String, Path> getPathMap() {
		return JsonUtility.toMap(JsonUtils.stringify(this));
	}

}