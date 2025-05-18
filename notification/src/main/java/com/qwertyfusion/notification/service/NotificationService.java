package com.qwertyfusion.notification.service;

import com.qwertyfusion.notification.model.Notification;
import com.qwertyfusion.notification.enums.NotificationType;
import com.qwertyfusion.notification.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository repository;
    private final ApplicationContext context;

    public Notification sendNotification(Notification notification) {
        notification.setTimestamp(LocalDateTime.now());
        notification.setStatus("SENT");

        // Get appropriate sender from context
        NotificationSender sender = (NotificationSender) context.getBean(notification.getType().name());
        sender.send(notification);

        return repository.save(notification);
    }

    public List<Notification> getUserNotifications(Long userId) {
        return repository.findByUserId(userId);
    }
}
