package com.edlumens.msc.pattern.observer;

public class ObservablePatternTest {

	public static void main(String[] args) {
		NewsAgency observable = new NewsAgency(  );
		NewsChannel observer1 = new NewsChannel( "News100" );
		NewsChannel observer2 = new NewsChannel( "True News" );
		observable.registerObserver(observer1);
 		observable.registerObserver(observer2);
		
		observable.notifyNewsBreakout("Big news arrived");
	 
	}

}
