package com.karthick.userservice;

import org.springframework.stereotype.Service;

import com.karthick.userservice.behaviour.EmailEventListener;
import com.karthick.userservice.behaviour.MyObserver;
import com.karthick.userservice.behaviour.Timeline;


@Service
public class ObserverPatternTest {

	public void excute() {
		
		//Creating new TL and subject
		Timeline tl = new Timeline();
		
		
		
		MyObserver user1 = new EmailEventListener(generateEmailDetails());
		MyObserver user2 = new EmailEventListener(generateEmailDetails());
		MyObserver user3 = new EmailEventListener(generateEmailDetails());
		
		tl.getNotificationServiceInstance().subscribe(user1);
		tl.getNotificationServiceInstance().subscribe(user2);
		tl.getNotificationServiceInstance().subscribe(user3);
		
		tl.setMessage("Hi, Timeline\nHow are you!\n");
		tl.getNotificationServiceInstance().unsubscribe(user3);
		System.out.println("---------------------------------------------------");
		tl.setMessage("Hi, Timeline\nThis is my second message!\n");
	}
	
	public static EmailDetails generateEmailDetails() {
		String emailFrom = "karthick270696@gmail.com";
		String emailTo = "karthick.vasudevan07@gmail.com";
		String emailSubject = "Test email from Karthick's System";
		String message = "\nHi,\n\nThis system generated email from Karthick Vasudevan."
				+ "\nIf you need any clarification please ping him in Whatsapp!\n\nRegards,"
				+ "\nKarthick V";
		return new EmailDetails(emailFrom, emailTo, emailSubject, message);
	}

}
