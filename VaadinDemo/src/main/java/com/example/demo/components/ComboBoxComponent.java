package com.example.demo.components;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.CheckBoxGroup;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.RadioButtonGroup;
import com.vaadin.ui.TwinColSelect;
import com.vaadin.ui.VerticalLayout;

public class ComboBoxComponent extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public void show() {
		VerticalLayout vertical = new VerticalLayout();
		vertical.setSpacing(true);

		// List of planets
		List<String> planets1 = new ArrayList<>();
		planets1.add("Mercury");
		planets1.add("Venus");
		planets1.add("Earth");
		planets1.add("Mars");
		planets1.add("jupiter");
		planets1.add("saturn");
		planets1.add("uranus");
		planets1.add("neptune");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		// this is an example for ComboBox format
		// Create the selection component
		ComboBox<String> select = new ComboBox<>("This is the list of comboBox planets ");
		select.setItems(planets1);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		// this is example for ListSelect
		// Create the selection component
		ListSelect<String> list = new ListSelect<>("The List");
		list.setItems(planets1);
		// Show 4 items and a scrollbar if there are more
		list.setRows(4);
		list.addValueChangeListener(event -> {
			Set<String> listed = event.getValue();
			Notification.show(listed.size() + " items.");
		});

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		// this is example for NativeSelect
		// Create the selection component
		NativeSelect<String> nativeSelect = new NativeSelect<>("New native Selection");
		nativeSelect.setItems(planets1);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// this is example for RadioButton group(it is an single selection component)
		RadioButtonGroup<String> single = new RadioButtonGroup<>("Single Selection");
		single.setItems(planets1);

		// You can disable individual items in a RadioButtonGroup or a CheckBoxGroup
		// Disable one item
		single.setItemEnabledProvider(item -> !"uranus".equals(item));

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// this is example for checkBox group(its an Multi-selection component)
		CheckBoxGroup<String> multi = new CheckBoxGroup<>("Multiple checks");
		multi.setItems(planets1);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		// this is example for twin column select
		TwinColSelect<String> twin = new TwinColSelect<>("Select targets");
		twin.setItems(planets1);
		twin.setRows(planets1.size());

		// Handle value changes
		twin.addSelectionListener(event -> vertical.addComponent(new Label("Selected: " + event.getNewSelection())));

		vertical.addComponent(select);
		vertical.addComponent(list);
		vertical.addComponent(nativeSelect);
		vertical.addComponent(single);
		vertical.addComponent(multi);
		vertical.setComponentAlignment(multi, Alignment.TOP_RIGHT);
		vertical.addComponent(twin);
		vertical.setComponentAlignment(twin, Alignment.TOP_RIGHT);
		addComponent(vertical);

	}

}
