package simpleController10;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.EventObject;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simpleController10.api.controller.ViewController;
import simpleController10.api.controller.ViewControllerDispatcher;
import simpleController10.core.controller.TestController;


//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/core/src/main/java/org/viewaframework/view/AbstractViewManager.java
public class ViewManager {
	private static final Logger logger = LoggerFactory.getLogger(ViewManager.class);
	private JFrame frame;
	private ViewControllerDispatcher 	dispatcher;
	public JFrame getFrame() {
		return frame;
	}

	public void addView	(ViewContainer view)  
	{	 
		System.out.println("add_view_called");
		Map<String,List<ViewController<? extends EventListener, ? extends EventObject>>>	controllers 			= null;

		ViewControllerDispatcher				controllerDispatcher	= this.getControllerDispatcher();
		controllers = controllerDispatcher.getViewControllers(view);
		
		if(null != view) {
			System.out.println("view_is_not_null");

		}
		List<ViewController<? extends EventListener, ? extends EventObject>> viewControllers = new ArrayList<ViewController<? extends EventListener, ? extends EventObject>>();
		viewControllers.add(new TestController());
		//view.getViewControllerMap().put("ControllerTestViewId.testButton",viewControllers);
		if(null != view) {
			logger.info("view_is_not_null");
		}else {
			logger.info("view_is_null");
		}
		if(null != view.getViewControllerMap()) {
			logger.info("map_is_not_null");
		}else {
			logger.info("map_is_null");
		}
		view.getViewControllerMap().put("SwingBuilderViewId.searchButton",viewControllers);
		view.viewInit();
		Component component = view.getRootPane();
		if(null !=component) {
			System.out.println("component_is_not_null");
		}else {
			System.out.println("component_is_null");
		}
		JFrame frame = this.getFrame();
		frame.add(component);
		
	}
	
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	public ViewControllerDispatcher getControllerDispatcher() {
		return this.dispatcher;
	}

	public void setControllerDispatcher(ViewControllerDispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}
}
