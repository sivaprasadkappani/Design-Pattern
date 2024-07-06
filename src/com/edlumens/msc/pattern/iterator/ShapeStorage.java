package com.edlumens.msc.pattern.iterator;

import java.util.Iterator;

public class ShapeStorage implements ShapeCollection{
	private Shape[] shapes = new Shape[5];
	private int index;

	public void addShape(String name) {
		int i = index++;
		shapes[i] = new Shape(i, name);
	}

	 

	@Override
	public Iterator getIterator() {
		ShapeIterator iterator = new ShapeIterator( shapes );
		return iterator;
	}
}