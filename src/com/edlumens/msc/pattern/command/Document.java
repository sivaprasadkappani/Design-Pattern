package com.edlumens.msc.pattern.command;

// Receiver
public class Document {

  public void insert(String str, int position) {
      System.out.println( "Inserting " + str + " at " +  position);
  }

  public void delete(int position, int noOfChars) {
	  System.out.println( "Deleting " + noOfChars + " from " +  position);
  }

  public void copy(int position, int noOfChars) {
	  System.out.println( "Copying  " + noOfChars + " from " +  position);
  }
}