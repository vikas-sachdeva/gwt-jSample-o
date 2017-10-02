package gwt.jSample;

import java.io.Serializable;

public class HelloServiceResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}