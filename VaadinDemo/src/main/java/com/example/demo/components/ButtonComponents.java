package com.example.demo.components;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class ButtonComponents extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public void show() {
		VerticalLayout verticalLayout = new VerticalLayout();
		verticalLayout.setSpacing(true);

		Label label = new Label("Hello Akshay");

		// this is a button component
		Button button = new Button("Click Here");
		button.addClickListener(click -> Notification.show("Execution Successfull"));

		// this is a Link field format
		Link link = new Link("Click here", new ExternalResource("http://www.google.com"));
		link.setDescription("open google web browser");

		// this is a checkBox format
		CheckBox checkBox1 = new CheckBox("Box A", true);
		CheckBox checkBox2 = new CheckBox("Box B");
		checkBox2.addValueChangeListener(event -> checkBox1.setValue(!checkBox2.getValue()));

		verticalLayout.addComponent(label);
		verticalLayout.addComponent(button);
		verticalLayout.addComponent(link);
		verticalLayout.addComponent(checkBox1);
		verticalLayout.addComponent(checkBox2);
		verticalLayout.setComponentAlignment(label, Alignment.TOP_LEFT);
		verticalLayout.setComponentAlignment(button, Alignment.TOP_LEFT);
		addComponent(verticalLayout);

		setComponentAlignment(verticalLayout, Alignment.TOP_RIGHT);
		setSizeFull();

	}
}
