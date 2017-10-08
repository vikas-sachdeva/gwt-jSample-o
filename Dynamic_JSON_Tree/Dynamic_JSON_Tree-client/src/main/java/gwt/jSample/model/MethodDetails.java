package gwt.jSample.model;

import com.google.gwt.core.client.JavaScriptObject;

public class MethodDetails extends JavaScriptObject {

	protected MethodDetails() {
	}

	public final native String getSummary()/*-{
		return this.summary;
	}-*/;

	public final native Parameters[] getParameters()/*-{
		return this.parameters;
	}-*/;

	public final native Responses getResponses()/*-{
		return this.responses;
	}-*/;
}
