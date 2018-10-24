package com.nekomajinj.event;


import java.util.Set;

public class GameEventListenerList {
	
	private Set<GameEventListener> set;
	
	GameEventListenerList(Set<GameEventListener> set){		
		this.set = set;
	}
	
	public Set<GameEventListener> getSet(){return this.set;}
}
