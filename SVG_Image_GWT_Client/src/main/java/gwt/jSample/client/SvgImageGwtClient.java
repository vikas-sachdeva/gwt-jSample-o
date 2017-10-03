package gwt.jSample.client;

import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.ui.SVGResource;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.resources.client.ResourceCallback;
import com.google.gwt.resources.client.ResourceException;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SvgImageGwtClient implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		try {
			SvgImageBundle.INSTANCE.sample().getSvg(new ResourceCallback<SVGResource>() {

				@Override
				public void onSuccess(SVGResource resource) {

					OMSVGSVGElement svg = resource.getSvg();
					RootPanel.get("gwtContainer").getElement().appendChild(svg.getElement());
				}

				@Override
				public void onError(ResourceException exception) {

					RootPanel.get("gwtContainer").getElement().setInnerHTML("Error occurred while rendering image.");
				}
			});
		} catch (ResourceException e) {
			e.printStackTrace();
		}
	}
}
