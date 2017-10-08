package gwt.jSample.model;

import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsonUtils;

import gwt.jSample.util.JsonUtility;

public class Path extends JavaScriptObject {

	protected Path() {

	}

	public final Map<String, MethodDetails> getMethodNameMethodDetailsMap() {
		return JsonUtility.toMap(JsonUtils.stringify(this));
	}
}