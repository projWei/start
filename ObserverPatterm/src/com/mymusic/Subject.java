package com.mymusic;
/*����ӿڣ�����ע��۲��ߣ��Ƴ��۲��ߺ�֪ͨ�۲���*/
public interface Subject {
	/*ע����Ƴ��۲��߷�������Ҫ�۲��߲���*/
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
