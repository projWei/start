package com.mymusic;
/*主题接口，用于注册观察者，移除观察者和通知观察者*/
public interface Subject {
	/*注册和移除观察者方法都需要观察者参数*/
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
