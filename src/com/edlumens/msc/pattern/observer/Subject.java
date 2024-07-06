package com.edlumens.msc.pattern.observer;

public interface Subject {

	void registerObserver(Channel channel);

	void removeObserver(Channel channel);

	void notifyNewsBreakout(String news);

}