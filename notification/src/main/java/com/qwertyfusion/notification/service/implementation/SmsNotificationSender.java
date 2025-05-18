package com.qwertyfusion.notification.service.implementation;

import com.qwertyfusion.notification.model.Notification;
import com.qwertyfusion.notification.service.NotificationSender;
import org.springframework.stereotype.Service;

@Service("SMS")
public class SmsNotificationSender implements NotificationSender {
    public void send(Notification notification) {
        System.out.println("Sending SMS: " + notification.getMessage());
    }
}
