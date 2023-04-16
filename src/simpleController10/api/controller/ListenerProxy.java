package simpleController10.api.controller;

import java.lang.reflect.InvocationHandler;
import java.util.EventListener;
import java.util.EventObject;

import simpleController10.core.controller.AbstractViewController;

public interface ListenerProxy <EL extends EventListener,EO extends EventObject> extends InvocationHandler{

//	public AbstractViewController getTargetController();
	public ViewController<EL, EO> getTargetController();
}
