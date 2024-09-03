package com.shop.jordancode.Service;
import org.springframework.stereotype.Service;

import com.shop.jordancode.Entities.Notification.Notification;
import com.shop.jordancode.Repositories.NotificationRepository;


@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }
}

