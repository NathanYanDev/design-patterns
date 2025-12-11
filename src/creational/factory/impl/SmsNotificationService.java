package creational.factory.impl;

import creational.factory.interfaces.NotificationService;

public class SmsNotificationService implements NotificationService {
  public void notifyUser() {
    System.out.println("SMS notification sent");
  }
}
