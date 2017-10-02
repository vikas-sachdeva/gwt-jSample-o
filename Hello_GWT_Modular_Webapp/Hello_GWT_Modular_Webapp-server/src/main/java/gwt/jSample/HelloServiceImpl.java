package gwt.jSample;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */

public class HelloServiceImpl extends RemoteServiceServlet implements HelloService {

	private static final long serialVersionUID = 1L;

	@Override
	public HelloServiceResponse getServerMessage(String input) throws IllegalArgumentException {
		// Verify that the input is valid.
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back
			// to
			// the client.
			throw new IllegalArgumentException("Name must be at least 4 characters long");
		}

		HelloServiceResponse response = new HelloServiceResponse();

		response.setMessage("Hello " + input);

		return response;
	}
}
