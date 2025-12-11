package creational.factory.impl;

import creational.factory.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {
  public void notifyUser() {
    System.out.println("Email notification sent");
  }
}
