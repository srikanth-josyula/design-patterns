package com.sample.structural.composite;

import java.util.ArrayList;
import java.util.List;

import com.sample.structural.composite.component.Items;

public class CompositeDirectory implements Items {
	private List<Items> itemsList = new ArrayList<Items>();

	public void showItemDetails() {
		for (Items emp : itemsList) {
			emp.showItemDetails(); //repeate
		}
	}

	public void addItems(Items item) {
		itemsList.add(item);
	}

	public void removeItems(Items item) {
		itemsList.remove(item);
	}
}
