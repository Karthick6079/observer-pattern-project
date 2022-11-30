package com.karthick.userservice.behaviour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.karthick.userservice.EmailDetails;

public class EmailEventListener implements MyObserver {

	@Autowired
	RestTemplate restTemplate;

	private EmailDetails emailDetails;
	
	String url = "http://localhost:8080/sendMail";

	/**
	 * @param emailDetails
	 */
	public EmailEventListener(EmailDetails emailDetails) {
		this.emailDetails = emailDetails;
	}

	@Override
	public void update() {

		

		// Automatically mail will be send if any update in store
		ResponseEntity<String> responseEntity = new RestTemplate().postForEntity(url, emailDetails, String.class);

		System.out.println("Mail send status " + responseEntity.getBody());

		System.out.println(emailDetails);

	}

}
