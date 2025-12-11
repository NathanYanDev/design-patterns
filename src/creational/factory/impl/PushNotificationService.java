package creational.factory.impl;

import creational.factory.interfaces.NotificationService;

public class PushNotificationService implements NotificationService {
  public void notifyUser() {
    System.out.println("Push notification sent");
  }
}
