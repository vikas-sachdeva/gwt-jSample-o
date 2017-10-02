package gwt.jSample;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {

	/**
	 * Create a remote service proxy to talk to the server-side service.
	 */
	private final HelloServiceAsync helloService = GWT.create(HelloService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Label label = new Label("Hello GWT !!!");
		Button button = new Button("Click Here");
		button.getElement().setId("my-Button");
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {

				helloService.getServerMessage("GWT Client", new AsyncCallback<HelloServiceResponse>() {

					@Override
					public void onFailure(Throwable caught) {
						Window.alert("This is error on server. Try again later");
					}

					@Override
					public void onSuccess(HelloServiceResponse result) {
						Window.alert("Message from server - " + result.getMessage());
					}
				});
			}
		});

		RootPanel.get().add(label);
		RootPanel.get().add(button);
	}
}