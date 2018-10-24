package com.nekomajinj.event;

public interface GameEventDispatcherIf {
	/**
	 * 添加事件监听
	 * @param type
	 * @param listener
	 * @return
	 */
	public String addEventListener(String type, GameEventListener listener);
	/**
	 * 移除事件监听
	 * @param type
	 * @param listener
	 */
	public void removeEventListener(String type, GameEventListener listener);
	/**
	 * 派发事件
	 * @param event
	 */
	public void dispatcheDispatchEvent(GameEvent event);
	/**
	 * 移除所有事件监听器
	 * @param type
	 */
	public void removeAllEventListener(String type);
}
