package com.example.demo.components;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class GridComponent extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public void show() {
		VerticalLayout verticalLayout = new VerticalLayout();
		verticalLayout.setSpacing(true);

		List<Person> group = new ArrayList<>();
		group.add(new Person("Akshay", 12121));
		group.add(new Person("Dhanushan", 12123));
		group.add(new Person("Subhiksha", 12125));
		group.add(new Person("Raghu", 12124));
		group.add(new Person("Arun", 12126));

		// grid
		Grid<Person> gridPeople = new Grid<>("Grid data created");
		gridPeople.setItems(group);
		gridPeople.setSizeFull();
		gridPeople.addColumn(Person::getName).setCaption("Name");
		gridPeople.addColumn(Person::getId).setCaption("Id");

		// this is selection mode in grid
		gridPeople.setSelectionMode(SelectionMode.MULTI);
		gridPeople.addSelectionListener(event -> {
			Set<Person> selected = event.getAllSelectedItems();
			Notification.show(selected.size() + " items selected");
		});

		verticalLayout.addComponent(gridPeople);
		addComponent(verticalLayout);
	}

}
