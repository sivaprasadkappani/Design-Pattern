package com.edlumens.msc.pattern.flyweight;

// Flyweight
// setColor method is to act on extrinsic state
public interface Pen {
	
	public void setColor(String color);
 	public void draw(String content);

}
