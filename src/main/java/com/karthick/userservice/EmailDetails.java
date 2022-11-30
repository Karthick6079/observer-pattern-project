package com.karthick.userservice;

public class EmailDetails {

	private String emailFrom;
	private String emailTo;
	private String subject;
	private String message;
	private String attachmentPath;

	/**
	 * @param emailFrom
	 * @param emailTo
	 * @param subject
	 * @param message
	 */
	public EmailDetails(String emailFrom, String emailTo, String subject, String message) {
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.subject = subject;
		this.message = message;
	}

	/**
	 * @return the emailFrom
	 */
	public String getEmailFrom() {
		return emailFrom;
	}

	/**
	 * @param emailFrom the emailFrom to set
	 */
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	/**
	 * @return the emailTo
	 */
	public String getEmailTo() {
		return emailTo;
	}

	/**
	 * @param emailTo the emailTo to set
	 */
	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
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
	}

	/**
	 * @return the attachmentPath
	 */
	public String getAttachmentPath() {
		return attachmentPath;
	}

	/**
	 * @param attachmentPath the attachmentPath to set
	 */
	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

	@Override
	public String toString() {
		return "EmailDetails [emailFrom=" + emailFrom + ", emailTo=" + emailTo + ", subject=" + subject + ", message="
				+ message + "]";
	}

}
