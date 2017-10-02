package gwt.jSample;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("hello")
public interface HelloService extends RemoteService {
	HelloServiceResponse getServerMessage(String name) throws IllegalArgumentException;
}
