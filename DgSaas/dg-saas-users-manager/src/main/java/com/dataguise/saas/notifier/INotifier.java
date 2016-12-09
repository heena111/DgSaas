package com.dataguise.saas.notifier;

import com.dataguise.webservices.beans.DgException;

public interface INotifier {

	public void sendNotification(String subject, String content, String emails,String messageType) throws DgException;

}