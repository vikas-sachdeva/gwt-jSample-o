package gwt.jSample.model;

import com.google.gwt.core.client.JavaScriptObject;

public class Status extends JavaScriptObject {

	protected Status() {

	}

	public final native String getDescription() /*-{
		return this.description;
	}-*/;
}
