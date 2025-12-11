package creational.factory;

import creational.factory.impl.NotificationServiceFactory;
import creational.factory.interfaces.NotificationService;

public class Main {
  public static void main(String[] args) {
    NotificationService email = NotificationServiceFactory.getNotificationService("email");
    NotificationService sms = NotificationServiceFactory.getNotificationService("sms");
    NotificationService push = NotificationServiceFactory.getNotificationService("push");

    email.notifyUser();
    sms.notifyUser();
    push.notifyUser();
  }
}
