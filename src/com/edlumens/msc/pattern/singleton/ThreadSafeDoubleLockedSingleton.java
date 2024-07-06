package com.edlumens.msc.pattern.singleton;

public class ThreadSafeDoubleLockedSingleton {
	// initialize the instance as null.
	private static ThreadSafeDoubleLockedSingleton instance = null;

	// private constructor, so it cannot be instantiated outside this class.
	private ThreadSafeDoubleLockedSingleton() {  }

	// check if the instance is null, within a synchronized block. If so, create the object
	public static ThreadSafeDoubleLockedSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeDoubleLockedSingleton();
				}
			}
		}
		return instance;
	}
}
