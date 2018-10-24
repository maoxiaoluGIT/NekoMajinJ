package com.nekomajinj.event;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GameEventDispatcher implements GameEventDispatcherIf{

	private Map<String , GameEventListenerList> gameEventDispatcher_listeners;
	
	/**
     * 添加事件
     * 
     * @param listener
     *            DoorListener
     */
	@Override
    public String addEventListener(String type, GameEventListener listener) {
        if (gameEventDispatcher_listeners == null) {
        	gameEventDispatcher_listeners = new HashMap<String,GameEventListenerList>();
        }
        GameEventListenerList list = gameEventDispatcher_listeners.get(type);
        if(list == null){
        	list = new GameEventListenerList(new HashSet<GameEventListener>());
        	gameEventDispatcher_listeners.put(type, list);
        }
        list.getSet().add(listener);
       // System.out.println(  gameEventDispatcher_listeners.get(type).getSet().size() );
        return type;
    }

    /**
     * 移除事件
     * 
     * @param listener
     *            DoorListener
     */
    @Override
    public void removeEventListener(String type, GameEventListener listener) {
        if (gameEventDispatcher_listeners == null){
            return;
        }
        GameEventListenerList list = gameEventDispatcher_listeners.get(type);
        if(list == null){
        	return;
        }
        list.getSet().remove(listener);
       // System.out.println(  gameEventDispatcher_listeners.get(type).getSet().size() );
    }
    
    /**
     * 触发事件
     */
    @Override
    public void dispatcheDispatchEvent(GameEvent event) {
        if (gameEventDispatcher_listeners == null)
            return;        
        gameEventDispatcheNotifyListeners(event);
    }
    
    /**
     * 移除所有事件
     */
    @Override
	public void removeAllEventListener(String type) {
		 if (gameEventDispatcher_listeners == null){
	            return;
	        }
	        GameEventListenerList list = gameEventDispatcher_listeners.get(type);
	        if(list == null){
	        	return;
	        }
	        list.getSet().clear();
	}
    
    /**
     * 通知所有的Listener
     */
    private void gameEventDispatcheNotifyListeners(GameEvent event) {
    	String type = event.getType();
    	if (gameEventDispatcher_listeners == null){
            return;
        }
    	
    	GameEventListenerList list = gameEventDispatcher_listeners.get(type);
        if(list == null){
        	return;
        } 
        
        Object[] arr = list.getSet().toArray();
        for (int i = 0; i < arr.length; i++) {
        	((GameEventListener)arr[i]).doEvent(event);
		}
        
    }

	

}
