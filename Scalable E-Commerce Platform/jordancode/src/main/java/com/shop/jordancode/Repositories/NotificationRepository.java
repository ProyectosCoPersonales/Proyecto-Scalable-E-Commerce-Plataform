package com.shop.jordancode.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.jordancode.Entities.Notification.Notification;



@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}

