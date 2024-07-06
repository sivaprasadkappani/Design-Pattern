package com.edlumens.msc.pattern.chainofresponsibility;

public class TextFileHandler implements Handler {
	private Handler nextHandler;
	private String handlerName;

	public TextFileHandler(String handlerName) {
		this.handlerName = handlerName;
	}

	@Override
	public void setHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void process(File file) {
		if (file.getFileType().equals("text")) {
			System.out.println("Process and saving text file... by " + handlerName);
		} 
		else if (nextHandler != null) {

			nextHandler.process(file);
		} 
		else {
			System.out.println("File not supported");
		}
	}

}
