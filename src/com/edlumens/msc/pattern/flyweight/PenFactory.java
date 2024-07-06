package com.edlumens.msc.pattern.flyweight;

import java.util.HashMap;


//FlyweightFactory
/*
 1. Creates and manages flyweight objects.
 2. Ensures that flyweights are shared properly. When a client requests a flyweight, 
    the FlyweightFactory object supplies an
    existing instance or creates one, if none exists
 */
public class PenFactory {
	private static final HashMap<String, Pen> pensMap = new HashMap<>();

	public static Pen getThickPen(String color) {
		String key = color + "-THICK";

		Pen pen = pensMap.get(key);

		if (pen != null) { 
			return pen;
		} else {
			pen = new ThickPen();
			pen.setColor(color);
			pensMap.put(key, pen);
		}

		return pen;
	}

	public static Pen getThinPen(String color) {
		String key = color + "-THIN";

		Pen pen = pensMap.get(key);

		if (pen != null) {
			return pen;
		} else {
			pen = new ThinPen();
			pen.setColor(color);
			pensMap.put(key, pen);
		}

		return pen;
	}

	public static Pen getMediumPen(String color) {
		String key = color + "-MEDIUM";

		Pen pen = pensMap.get(key);

		if (pen != null) {
			return pen;
		} else {
			pen = new MediumPen();
			pen.setColor(color);
			pensMap.put(key, pen);
		}

		return pen;
	}
}
