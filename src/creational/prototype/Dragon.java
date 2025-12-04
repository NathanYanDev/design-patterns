package creational.prototype;

public class Dragon extends Enemy{
  public int firePower;

  public Dragon() {}

  public Dragon(Dragon dragon) {
    super(dragon);
    this.firePower = dragon.firePower;
  }

  @Override
  public Dragon clone() {
    return new Dragon(this);
  }

  @Override
  public String toString() {
    return "Dragon{" +
        "firePower=" + firePower +
        ", name='" + name + '\'' +
        ", level=" + level +
        ", hp=" + hp +
        ", mp=" + mp +
        '}';
  }
}
