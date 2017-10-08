package gwt.jSample;

import java.util.Map;
import java.util.Map.Entry;

import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;

import gwt.jSample.model.MethodDetails;
import gwt.jSample.model.Parameters;
import gwt.jSample.model.Path;
import gwt.jSample.model.Responses;
import gwt.jSample.model.Status;
import gwt.jSample.model.SwaggerObject;

public class JsonTree {

	private String jsonData;

	public JsonTree(String jsonData) {
		this.jsonData = jsonData;
	}

	public Tree constructTree() {

		Tree tree = new Tree();

		if (jsonData != null && !jsonData.isEmpty()) {

			SwaggerObject swaggerObject = JsonUtils.safeEval(jsonData);

			TreeItem rootItem = new TreeItem();
			rootItem.setText("swagger.json - http://" + swaggerObject.getHost() + "/" + swaggerObject.getBasePath());
			tree.addItem(rootItem);

			Map<String, Path> pathMap = swaggerObject.getPaths().getPathMap();

			for (Entry<String, Path> pathEntry : pathMap.entrySet()) {

				TreeItem pathItem = new TreeItem();
				pathItem.setText(pathEntry.getKey());
				rootItem.addItem(pathItem);

				Map<String, MethodDetails> mapMethodNameMethodDetails = pathEntry.getValue()
						.getMethodNameMethodDetailsMap();

				for (Entry<String, MethodDetails> methodEntry : mapMethodNameMethodDetails.entrySet()) {

					TreeItem methodItem = new TreeItem();
					methodItem.setText(methodEntry.getValue().getSummary() + "(" + methodEntry.getKey() + ")");
					pathItem.addItem(methodItem);

					Parameters[] parametersList = methodEntry.getValue().getParameters();

					for (int j = 0; j < parametersList.length; j++) {

						TreeItem paramtersItem = new TreeItem();
						paramtersItem.setText("parameters");
						methodItem.addItem(paramtersItem);

						String name = parametersList[j].getName();

						TreeItem paramterItem = new TreeItem();
						paramterItem.setText(name);
						paramtersItem.addItem(paramterItem);

					}

					Responses responses = methodEntry.getValue().getResponses();

					TreeItem responsesItem = new TreeItem();
					responsesItem.setText("Responses");
					methodItem.addItem(responsesItem);

					Map<String, Status> statusMap = responses.getStatusMap();

					for (Entry<String, Status> entry : statusMap.entrySet()) {

						String status = entry.getKey();
						String description = entry.getValue().getDescription();

						TreeItem descriptionItem = new TreeItem();
						descriptionItem.setText(status + ":" + description);
						responsesItem.addItem(descriptionItem);
					}

				}
			}
		}
		return tree;
	}
}