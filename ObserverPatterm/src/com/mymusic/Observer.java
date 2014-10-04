package com.mymusic;
/*观察者接口，更新数据*/
public interface Observer {
	public void update(float temp,float humidity,float pressure/*具体参数自己设置*/);
}
