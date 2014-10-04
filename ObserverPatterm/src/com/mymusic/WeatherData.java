package com.mymusic;

import java.util.ArrayList;

/*该类实现了主题接口*/
public class WeatherData implements Subject {
	private ArrayList<Observer> observers;//用来存放注册的观察者
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers=new ArrayList<Observer>();
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.size();i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
	}
	public void measurementsChanged(){
		notifyObservers();
	}
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.humidity=humidity;
		this.pressure=pressure;
		this.temperature=temperature;
		measurementsChanged();
	}
}
