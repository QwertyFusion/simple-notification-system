package com.qwertyfusion.notification.service.implementation;

import com.qwertyfusion.notification.model.Notification;
import com.qwertyfusion.notification.service.NotificationSender;
import org.springframework.stereotype.Service;

@Service("INAPP")
public class InAppNotificationSender implements NotificationSender {
    public void send(Notification notification) {
        System.out.println("Sending In-App Notification: " + notification.getMessage());
    }
}
