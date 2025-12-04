package creational.singleton;

public class AppConfig {
  private static AppConfig instance;
  private AppConfig(){};

  private String language;
  private String theme;
  private int fontSize;

  public static AppConfig getInstance() {
    if(instance == null) {
      instance = new AppConfig();
    }
    return instance;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public void setFontSize(int fontSize) {
    this.fontSize = fontSize;
  }

  public String getLanguage() {
    return language;
  }

  public String getTheme() {
    return theme;
  }

  public int getFontSize() {
    return fontSize;
  }

  @Override
  public String toString() {
    return "AppConfig [language=" + language + ", theme=" + theme + ", fontSize=" + fontSize + "]";
  }
}
