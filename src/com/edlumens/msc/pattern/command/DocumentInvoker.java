package com.edlumens.msc.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class DocumentInvoker {
	  
    private Document document;
    private List<Command> commandHistory = new ArrayList<Command>();
  
    public DocumentInvoker(Document document) {
        this.document = document;
    }
  
    public void cut(int position, int length) {
        Command cutCommand = new CutCommand(document, position, length);
        commandHistory.add(cutCommand);
    }
  
    public void copy(int position, int length) {
        Command copyCommand = new CopyCommand(document, position, length);
        commandHistory.add(copyCommand);
    }
  
   public void paste(String text, int position) {
        Command pasteCommand = new PasteCommand(document, text, position);
        commandHistory.add(pasteCommand);
    }
  
}