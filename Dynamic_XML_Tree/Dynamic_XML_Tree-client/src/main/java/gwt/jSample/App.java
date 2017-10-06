package gwt.jSample;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Tree;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {

	private static final String API_URL = "api/xmlData";

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		fetchXmlDataFromServer();
	}

	private void fetchXmlDataFromServer() {

		String moduleBaseURL = GWT.getModuleBaseURL();
		String moduleName = GWT.getModuleName();
		String contextURL = moduleBaseURL.substring(0, moduleBaseURL.lastIndexOf(moduleName));
		final String url = contextURL + API_URL;

		// GWT does not support synchronous API calling.
		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, url);
		try {

			builder.sendRequest("", new RequestCallback() {

				@Override
				public void onResponseReceived(Request request, Response response) {
					String xmlData = response.getText();

					Tree tree = new XmlTree(xmlData).constructTree();

					RootPanel.get("gwtContainer").add(tree);
				}

				@Override
				public void onError(Request request, Throwable exception) {
					RootPanel.get("gwtContainer").getElement()
							.setInnerHTML("Error occurred while fetching data from server");
				}
			});

		} catch (RequestException e) {
			RootPanel.get("gwtContainer").getElement().setInnerHTML("Error occurred while fetching data from server");
		}
	}
}
