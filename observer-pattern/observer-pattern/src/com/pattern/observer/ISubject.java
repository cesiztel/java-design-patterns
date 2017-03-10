package com.pattern.observer;

public interface ISubject {
	
	/**
	 * Subscribe an observer to the list
	 * of observers. To reuse the pattern
	 * in any kind of concrete observer
	 * we pass the interface. The concrete implementation
	 * of the observer will come in the specific class of
	 * the observer. The implementation will be responsible 
	 * to include the logic about what to do after being
	 * notify of changes in the subject
	 * 
	 * @param obj
	 */
	public void register(IObserver obj);
	
	/**
	 * Unregister the observer to the list
	 * 
	 * @param obj
	 */
	public void unregister(IObserver obj);
	
	/**
	 * Notify all the list of observers about
	 * some change in the subject
	 * 
	 */
	public void notifyObservers();
	
	/**
	 * Get the state of the subject by
	 * demand in case the observer wants 
	 * to know the state of the subject
	 * 
	 * @param obj
	 * @return
	 */
	public Object getUpdate(IObserver obj);
}
