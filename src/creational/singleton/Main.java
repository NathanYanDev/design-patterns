package creational.singleton;

public class Main {
  public static void main(String[] args) {
    AppConfig appConfig = AppConfig.getInstance();
    appConfig.setLanguage("en");
    appConfig.setTheme("dark");
    appConfig.setFontSize(12);

    System.out.println(appConfig);

    AppConfig appConfig2 = AppConfig.getInstance();
    System.out.println(appConfig2);
  }
}
