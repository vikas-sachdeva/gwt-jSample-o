package gwt.jSample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class UiBinderHorizontalPanelClient implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		CustomHorizontalPanelWidget customWidget = new CustomHorizontalPanelWidget();

		// add the tree to the root panel
		RootPanel.get("gwtContainer").add(customWidget);

	}
}
