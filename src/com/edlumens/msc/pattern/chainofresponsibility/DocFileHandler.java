package com.edlumens.msc.pattern.chainofresponsibility;

public class DocFileHandler implements Handler {
	private Handler handler;
	private String handlerName;

	public DocFileHandler(String handlerName) {
		this.handlerName = handlerName;
	}

	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	@Override
	public void process(File file) {
		if (file.getFileType().equals("doc")) {
			System.out.println("Process and saving doc file... by " + handlerName);
		} else if (handler != null) {

			handler.process(file);
		} else {
			System.out.println("File not supported");
		}
	}

}