package gwt.jSample.model;

import com.google.gwt.core.client.JavaScriptObject;

public class Parameters extends JavaScriptObject {

	protected Parameters() {

	}

	public final native String getName() /*-{
		return this.name;
	}-*/;

}
