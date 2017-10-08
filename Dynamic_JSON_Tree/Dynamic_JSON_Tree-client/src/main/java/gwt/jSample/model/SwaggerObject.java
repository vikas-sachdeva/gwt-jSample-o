package gwt.jSample.model;

import com.google.gwt.core.client.JavaScriptObject;

public class SwaggerObject extends JavaScriptObject {

	protected SwaggerObject() {

	}

	public final native String getHost()/*-{
		return this.host;
	}-*/;

	public final native String getBasePath() /*-{
		return this.basePath;
	}-*/;
	
	public final native Paths getPaths()  /*-{
		return this.paths;
}-*/;

	/*public SwaggerObject(String jsonData) {
		JSONValue jsonValue = JSONParser.parseStrict(jsonData);
		JSONObject jsonObject = jsonValue.isObject();

		if (jsonObject.containsKey("host")) {
			host = jsonObject.get("host").isString().stringValue();
		}

		if (jsonObject.containsKey("basePath")) {
			basePath = jsonObject.get("basePath").isString().stringValue();
		}

		if (jsonObject.containsKey("paths")) {
			JSONObject pathJsonObject = jsonObject.get("paths").isObject();

			paths = new Paths();

			Set<String> pathKeySet = pathJsonObject.keySet();
			for (String pathKey : pathKeySet) {
				JSONObject pathObject = pathJsonObject.get(pathKey).isObject();

				Path path = new Path();
				path.setValue(pathKey);
				paths.getPathList().add(path);

				Set<String> methodKeySet = pathObject.keySet();
				for (String methodKey : methodKeySet) {

					JSONObject methodObject = pathObject.get(methodKey).isObject();

					String methodDetailsString = methodObject.toString();

					MethodType methodType = new MethodType();
					methodType.setValue(methodKey);
					path.getMethodTypeList().add(methodType);

					MethodDetails methodDetails = JsonUtils.safeEval(methodDetailsString);
					methodType.setMethodDetails(methodDetails);
				}
			}
		}
	}*/

	

}
