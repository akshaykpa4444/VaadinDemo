package com.example.demo.components;

import java.time.LocalDate;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class TextFieldComponent extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public void show() {
		VerticalLayout verticalLayout = new VerticalLayout();
		verticalLayout.setSpacing(true);

		// this is a label component
		Label label = new Label("Hello Akshay");

		// this is a textfield component
		TextField tf = new TextField("Field");
		tf.setValue("This Is a Textfield");

		// this is a textarea component
		TextArea text = new TextArea("Area");
		text.setValue("Akshay\n" + "Dhanushan\n" + "Arun\n");

		// this is a password component
		PasswordField password = new PasswordField("PASSWORD");
		password.setValue("haidude");

		// this is a rich text area conrains text formats
		final RichTextArea rtarea = new RichTextArea();
		rtarea.setCaption("My Rich text Area");
		rtarea.setValue("<h1>Hello Akshay</h1>\n" + "<p>This rich text area contains some text.</p>");

		// this is a date format
		DateField date = new DateField();
		date.setValue(LocalDate.now());

		verticalLayout.addComponent(label);
		verticalLayout.addComponent(tf);
		verticalLayout.addComponent(text);
		verticalLayout.addComponent(password);
		verticalLayout.addComponent(rtarea);
		verticalLayout.addComponent(date);
		verticalLayout.setComponentAlignment(rtarea, Alignment.TOP_LEFT);
		verticalLayout.setComponentAlignment(date, Alignment.TOP_LEFT);
		addComponent(verticalLayout);

		setComponentAlignment(verticalLayout, Alignment.MIDDLE_CENTER);
		setSizeFull();
	}
}