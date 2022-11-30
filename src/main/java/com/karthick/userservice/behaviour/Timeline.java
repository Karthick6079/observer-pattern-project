package com.karthick.userservice.behaviour;

public class Timeline {

	private String message;
	
	private NotificationService notificationService;

	/**
	 * 
	 */
	public Timeline() {
		notificationService = new NotificationService();
	}
	
	public NotificationService getNotificationServiceInstance() {
		return this.notificationService;
	}

	/**
	 * @param message
	 */
	public Timeline(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
		System.out.println(this.message);
		this.notificationService.notifySubscribers();
	}

}
