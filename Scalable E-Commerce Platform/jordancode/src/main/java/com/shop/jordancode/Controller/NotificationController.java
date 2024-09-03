package com.shop.jordancode.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.shop.jordancode.Entities.Notification.Notification;
import com.shop.jordancode.Service.NotificationService;

@RestController
@RequestMapping("/api/admin/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    @PostMapping
    public ResponseEntity<Notification> createNotification(@RequestBody Notification notification) {
        Notification createdNotification = notificationService.saveNotification(notification);
        return ResponseEntity.ok(createdNotification);
    }
}

