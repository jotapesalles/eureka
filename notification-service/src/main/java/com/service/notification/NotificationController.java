package com.service.notification;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

  private final List<Notification> notifications = new ArrayList<>();
  private int sequenceId = 1;

  @GetMapping("/users/{userId}")
  public List<Notification> getNotificationsByUserId(@PathVariable int userId) {
    return new ArrayList<>(
        notifications.stream().filter(notification -> notification.getUserId() == userId).toList());
  }

  @GetMapping("/users/{userId}/unread")
  public List<Notification> getUnreadNotificationsByUserId(@PathVariable int userId) {
    return new ArrayList<>(
        notifications.stream()
            .filter(notification -> notification.getUserId() == userId && !notification.isRead())
            .toList());
  }

  @PostMapping
  public Notification createNotification(@RequestBody Notification notification) {
    Notification newNotification =
        new Notification(sequenceId++, notification.getMessage(), notification.getUserId(), false);
    notifications.add(newNotification);
    return newNotification;
  }

  @PutMapping("/user/{userId}/mark-read")
  public void markAllNotificationsAsRead(@PathVariable int userId) {
    notifications.forEach(
        notification -> {
          if (notification.getUserId() == userId && !notification.isRead()) {
            notification.setRead(true);
          }
        });
  }
}
