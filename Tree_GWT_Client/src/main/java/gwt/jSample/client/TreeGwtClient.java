package gwt.jSample.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TreeGwtClient implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		TreeItem rootNode = new TreeItem();
		rootNode.setText("Root Node");

		TreeItem firstNode = new TreeItem();
		firstNode.setText("First Node");

		TreeItem secondNode = new TreeItem();
		secondNode.setText("Second Node");

		TreeItem thirdNode = new TreeItem();
		thirdNode.setText("Third Node");

		TreeItem firstNodeChild1 = new TreeItem();
		firstNodeChild1.setText("First Node Child - 1");

		TreeItem firstNodeChild2 = new TreeItem();
		firstNodeChild2.setText("First Node Child - 2");

		TreeItem firstNodeChild3 = new TreeItem();
		firstNodeChild3.setText("First Node Child - 3");

		// add employees to sales department
		firstNode.addItem(firstNodeChild1);
		firstNode.addItem(firstNodeChild2);
		firstNode.addItem(firstNodeChild3);

		// create other tree items as employees

		TreeItem secondNodeChild1 = new TreeItem();
		secondNodeChild1.setText("Second Node Child - 1");

		TreeItem secondNodeChild2 = new TreeItem();
		secondNodeChild2.setText("Second Node Child - 2");

		// add employees to marketing department
		secondNode.addItem(secondNodeChild1);
		secondNode.addItem(secondNodeChild2);

		TreeItem thirdNodeChild1 = new TreeItem();
		thirdNodeChild1.setText("Third Node Child - 1");

		TreeItem thirdNodeChild2 = new TreeItem();
		thirdNodeChild2.setText("Third Node Child - ");

		// add employees to sales department
		thirdNode.addItem(thirdNodeChild1);
		thirdNode.addItem(thirdNodeChild2);

		// add departments to department item
		rootNode.addItem(firstNode);
		rootNode.addItem(secondNode);
		rootNode.addItem(thirdNode);

		// create the tree
		Tree tree = new Tree();

		// add root item to the tree
		tree.addItem(rootNode);

		// Add text boxes to the root panel.
		VerticalPanel panel = new VerticalPanel();
		panel.setSpacing(10);
		panel.add(tree);

		// add the tree to the root panel
		RootPanel.get("gwtContainer").add(panel);
	}
}
