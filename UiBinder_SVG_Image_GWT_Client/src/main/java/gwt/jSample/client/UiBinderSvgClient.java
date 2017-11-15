package gwt.jSample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class UiBinderSvgClient implements EntryPoint {

	@Override
	public void onModuleLoad() {
		CustomSvgWidget customWidget = new CustomSvgWidget();

		// add the tree to the root panel
		RootPanel.get("gwtContainer").add(customWidget);
	}
}
