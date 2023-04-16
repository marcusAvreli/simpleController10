package simpleController10;

import java.awt.Component;

public class DefaultViewContainer extends AbstractViewContainer{

	/**
	 * 
	 */
	public DefaultViewContainer(){
		super();
	}
	
	/**
	 * @param id
	 * @param component
	 */
	public DefaultViewContainer(String id,Component component){
		this();
		this.setId(id);
		this.setTitle(id);
		this.getContentPane().add(component);
	}
	
	/**
	 * @param id
	 * @param title
	 * @param component
	 */
	public DefaultViewContainer(String id,String title,Component component){
		this();
		this.setId(id);
		this.setTitle(title);
		this.getContentPane().add(component);
	}

}
