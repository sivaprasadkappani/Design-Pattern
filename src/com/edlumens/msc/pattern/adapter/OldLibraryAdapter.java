package com.edlumens.msc.pattern.adapter;

//Adapter: Adapts the OldLibrary to the NewInterface
class OldLibraryAdapter implements NewInterface {
	private OldLibrary oldLibrary;// Indian style plug device

	public OldLibraryAdapter(OldLibrary oldLibrary) {
		this.oldLibrary = oldLibrary;
	}

	@Override
	public void doSomethingNew() {  // flat type socket
		System.out.println("OldLibraryAdapter: Adapting the old library to the new interface.");
		oldLibrary.doSomethingOld(); // / Indian style socket
	}
}