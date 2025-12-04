package creational.prototype;

public abstract class Enemy {
  public String name;
  public int level;
  public int hp;
  public int mp;

  public Enemy() {}

  public Enemy(Enemy enemy) {
    this.name = enemy.name;
    this.level = enemy.level;
    this.hp = enemy.hp;
    this.mp = enemy.mp;
  }

  public abstract Enemy clone();
}
