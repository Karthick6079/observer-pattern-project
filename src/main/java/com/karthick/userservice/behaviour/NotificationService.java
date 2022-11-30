package com.karthick.userservice.behaviour;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Subject {

	List<MyObserver> users;

	public NotificationService() {
		users = new ArrayList<>();
	}

	@Override
	public void subscribe(MyObserver observer) {
		users.add(observer);

	}

	@Override
	public void unsubscribe(MyObserver observer) {
		users.remove(observer);

	}

	@Override
	public void notifySubscribers() {
		users.forEach(observer -> observer.update());
	}

}
