package gwt.jSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JsonDataService extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final String FILE_PATH = "F:/mine/eclipse/repo/gwt-jSample-workspace/Dynamic_JSON_Tree/Dynamic_JSON_Tree-server/input/sample.json";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<String> fileData = Files.readAllLines(Paths.get(FILE_PATH));

		String data = String.join(System.lineSeparator(), fileData);

		resp.getOutputStream().write(data.getBytes("UTF-8"));
		resp.getOutputStream().flush();

	}
}
