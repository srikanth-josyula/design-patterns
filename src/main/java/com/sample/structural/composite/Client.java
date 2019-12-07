package com.sample.structural.composite;

import com.sample.structural.composite.component.leafImpl.Box;
import com.sample.structural.composite.component.leafImpl.Products;

public class Client {

	public static void main(String[] args) {
		Products prod1 = new Products("Chair", "Small Furniture");
		Products prod2 = new Products("Bed", "Huge Furniture");
		CompositeDirectory prodDirectory = new CompositeDirectory();
		prodDirectory.addItems(prod1);
		prodDirectory.addItems(prod2);

		Box box1 = new Box("Tables and Chairs", "Small Furniture Box");
		Box box2 = new Box("Beds and Dessing Funiture", "Huge Furniture Box");

		CompositeDirectory boxDirectory = new CompositeDirectory();
		boxDirectory.addItems(box1);
		boxDirectory.addItems(box2);

		CompositeDirectory directory = new CompositeDirectory();
		directory.addItems(prodDirectory);
		directory.addItems(boxDirectory);
		directory.showItemDetails();
	}
}
