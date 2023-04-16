package simpleController10.core.controller;

import java.awt.event.ActionListener;

import simpleController10.DefaultViewContainer;

public class TestView extends DefaultViewContainer{
	public static final String ID = "ControllerTestViewId";	
	/**
	 * Default constructor
	 */
	public TestView(){
		super(ID,"testTitle",new TestPanel());
		
	}
	
}