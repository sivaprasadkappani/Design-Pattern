package com.edlumens.msc.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private List<Channel> channels = new ArrayList<>();

    @Override
	public void registerObserver(Channel channel) {
        this.channels.add(channel);
    }

    @Override
	public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    @Override
	public void notifyNewsBreakout(String news) {
        for (Channel channel : this.channels) {
            channel.update( news );
        }
    }
}