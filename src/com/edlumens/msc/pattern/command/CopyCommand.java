package com.edlumens.msc.pattern.command;

public class CopyCommand implements Command {

	private Document document;
	private int startPosition;
	private int length;

	public CopyCommand(Document document, int position, int length) {
		this.document = document;
		this.startPosition = position;
		this.length = length;
	}

	@Override
	public void execute() {
		document.copy(startPosition, length);

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
