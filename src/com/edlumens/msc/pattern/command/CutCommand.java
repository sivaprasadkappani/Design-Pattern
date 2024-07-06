package com.edlumens.msc.pattern.command;

public class CutCommand implements Command {
	private Document document;
	private int startPosition;
	private int noOfChars;
	
	public CutCommand(Document document, int position, int length) {
		this.document = document;
		this.startPosition = position;
		this.noOfChars = length;
	}

	

	// suitable constructor

	public void execute() {
		document.delete(startPosition, noOfChars);
	}

	public void undo() {
		 
	}

}
