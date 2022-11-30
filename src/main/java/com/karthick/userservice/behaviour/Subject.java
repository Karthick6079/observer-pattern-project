package com.karthick.userservice.behaviour;

public interface Subject {

	void subscribe(MyObserver observer);

	void unsubscribe(MyObserver observer);

	void notifySubscribers();

}
