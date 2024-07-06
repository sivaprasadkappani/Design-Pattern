package com.edlumens.msc.pattern.adapter;

//Client code
public class Main {
	public static void main(String[] args) {
		// Using the OldLibrary directly
		OldLibrary oldLibrary = new OldLibrary();
		oldLibrary.doSomethingOld(); // indian type socket

		// Here the situation changed
		// Using the Adapter to access OldLibrary through NewInterface
		NewInterface adapter = new OldLibraryAdapter(oldLibrary);
		adapter.doSomethingNew(); // flat type socket
	}
}