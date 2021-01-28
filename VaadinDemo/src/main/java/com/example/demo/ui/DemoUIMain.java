package com.example.demo.ui;

import com.example.demo.components.GridComponent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@SpringUI
public class DemoUIMain extends UI {

	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {

		GridComponent component = new GridComponent();
		component.show();
		setContent(component);

	}

}
