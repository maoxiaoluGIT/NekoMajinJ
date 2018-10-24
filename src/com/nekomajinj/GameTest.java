package com.nekomajinj;

import com.nekomajinj.event.GameEvent;
import com.nekomajinj.event.GameEventDispatcher;
import com.nekomajinj.event.GameEventListener;



public class GameTest extends GameEventDispatcher implements GameEventListener{
	public static String TestEvent = "TestEvent";
	
	public void test(){
		System.out.println("执行方法tset()");
		GameEvent event = new GameEvent(TestEvent, "事件触发");
		this.dispatcheDispatchEvent(event);				
	}

	@Override
	public void doEvent(GameEvent gameEvent) {
		System.out.println( gameEvent.getType());
		System.out.println( gameEvent.getTarget());
		
	}
}
