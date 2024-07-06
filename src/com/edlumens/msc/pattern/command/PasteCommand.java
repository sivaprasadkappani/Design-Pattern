package com.edlumens.msc.pattern.command;

public class PasteCommand implements Command {

	private Document document;
	private String text;
	private int startPosition;

	public PasteCommand(Document document, String text, int position) {
		this.document = document;
		this.startPosition = position;
		this.startPosition = position;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}

}
