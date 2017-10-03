package gwt.jSample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class UiBinderGwtClient implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		CustomWidget customWidget = new CustomWidget();

		customWidget.setMessage(
				"Security awareness and training are typically covered under the single heading of Information Security Awareness Training.  In fact, that's the approach I took in the previous two posts on this topic, covering how to change employee behavior at a high level.  This high-level approach is appropriate for many organizations, especially those with tenuous management commitment and a meager budget.  However, awareness and training, when part of a formal methodology for employee behavior modification, are actually two different activities.");

		// add the tree to the root panel
		RootPanel.get("gwtContainer").add(customWidget);

	}
}
