package com.qwertyfusion.notification.service;

import com.qwertyfusion.notification.model.Notification;

public interface NotificationSender {
    void send(Notification notification);
}
