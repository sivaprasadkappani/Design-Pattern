package com.edlumens.msc.pattern.observer;

public class NewsChannel implements Channel {
    private String news;
    private String channelName;

    public NewsChannel(String channelName ) {
		this.channelName = channelName;
	}

	@Override
    public void update(Object news) {
        this.setNews((String) news);
        System.out.println( news + " [" + channelName + " ]" );
    }

	private void setNews(String news ) {
		this.news = news;
		
	} 

}