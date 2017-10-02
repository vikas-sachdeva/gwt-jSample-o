package gwt.jSample;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>HelloService</code>.
 */
public interface HelloServiceAsync {
	void getServerMessage(String input, AsyncCallback<HelloServiceResponse> callback)
			throws IllegalArgumentException;
}
