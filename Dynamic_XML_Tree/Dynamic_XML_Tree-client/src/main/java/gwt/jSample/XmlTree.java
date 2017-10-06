package gwt.jSample;

import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.Node;
import com.google.gwt.xml.client.NodeList;
import com.google.gwt.xml.client.XMLParser;

public class XmlTree {

	private String xmlData;

	public XmlTree(String xmlData) {
		this.xmlData = xmlData;
	}

	public Tree constructTree() {
		Tree tree = new Tree();

		if (xmlData != null && !xmlData.isEmpty()) {

			// parse the XML document into a DOM
			Document xmlDocument = XMLParser.parse(xmlData);

			String rootElementValue = xmlDocument.getDocumentElement().getAttribute("value");
			TreeItem rootItem = new TreeItem();
			rootItem.setHTML(rootElementValue);
			tree.addItem(rootItem);

			NodeList nodeList = xmlDocument.getElementsByTagName("node");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				Element element = (Element) node;

				TreeItem treeNode = new TreeItem();

				treeNode.setHTML(element.getAttribute("value"));
				rootItem.addItem(treeNode);

				NodeList childNodeList = element.getElementsByTagName("child");

				for (int j = 0; j < childNodeList.getLength(); j++) {
					Node childNode = childNodeList.item(j);
					Element childElement = (Element) childNode;

					TreeItem treeChildNode = new TreeItem();

					String value = childElement.getFirstChild().getNodeValue();

					treeChildNode.setHTML(value);
					treeNode.addItem(treeChildNode);
				}
			}
		}
		return tree;
	}
}
