package com.edlumens.msc.pattern.chainofresponsibility;


public interface Handler {
	
	public void setHandler(Handler handler);
	public void process(File file);
	
}
