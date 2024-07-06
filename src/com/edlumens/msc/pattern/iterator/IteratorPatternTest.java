package com.edlumens.msc.pattern.iterator;

import java.util.Iterator;

public class IteratorPatternTest {
	public static void main(String[] args) {
		ShapeStorage storage = new ShapeStorage();
		storage.addShape("Polygon");
		storage.addShape("Hexagon");
		storage.addShape("Circle");
		storage.addShape("Rectangle");
		storage.addShape("Square");
		Iterator iterator = storage.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
