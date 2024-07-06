package com.edlumens.msc.pattern.command;

// Command
public interface Command {
	void execute();
    void undo();
  
    default boolean isReversible() {
        return true;
    }
}
