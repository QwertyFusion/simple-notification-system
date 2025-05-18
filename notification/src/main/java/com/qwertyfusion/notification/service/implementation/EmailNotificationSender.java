package com.qwertyfusion.notification.service.implementation;

import com.qwertyfusion.notification.model.Notification;
import com.qwertyfusion.notification.service.NotificationSender;
import org.springframework.stereotype.Service;

@Service("EMAIL")
public class EmailNotificationSender implements NotificationSender {
    public void send(Notification notification) {
        System.out.println("Sending Email: " + notification.getMessage());
    }
}
