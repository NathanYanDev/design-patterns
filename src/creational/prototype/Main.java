package creational.prototype;

public class Main {
  public static void main(String[] args) {
    Dragon dragon = new Dragon();
    dragon.name = "Shenlong";
    dragon.level = 10;
    dragon.hp = 100;
    dragon.mp = 50;
    dragon.firePower = 10;
    Dragon dragon2 = dragon.clone();

    System.out.println(dragon);
    System.out.println(dragon2);
  }
}
