package com.nekomajinj.event;

public class GameEvent {
	
	private Object target;	
	
	private String type; 	
	
	/**[read-only] 事件目标。*/
	public Object getTarget() {
		return target;
	}	
	/**[read-only] 事件的类型。*/
	public String getType() {
		return type;
	}
	/**
	 * 游戏基础事件
	 * @param type
	 * @param target
	 */
	public GameEvent(String type , Object target) {
		this.type = type;
		this.target = target;
	}

}
