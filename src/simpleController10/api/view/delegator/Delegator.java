package simpleController10.api.view.delegator;

import simpleController10.ViewContainer;

public interface Delegator {
	
	public void inject(ViewContainer viewContainer);
	public void clean(ViewContainer viewContainer);

}