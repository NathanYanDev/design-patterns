package creational.factory.impl;

import creational.factory.interfaces.NotificationService;

public class NotificationServiceFactory {
  public static NotificationService getNotificationService(String type) {
    return switch (type) {
      case "email" -> new EmailNotificationService();
      case "sms" -> new SmsNotificationService();
      case "push" -> new PushNotificationService();
      default -> throw new IllegalArgumentException("Invalid notification type");
    };
  }
}
