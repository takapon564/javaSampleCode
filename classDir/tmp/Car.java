package tmp;
public class Car {
  private int speed;

  public int speedUp(int value) {
    value = (value >= 0 ? value :0);
    this.speed += value;

    if(speed >= 180) {
      speed = 180;
    }

    return this.speed;
  }

  public int speedDown(int value) {
    value = (value >= 0 ? value : 0);
    this.speed -= value;

    if(this.speed <= -15) {
      this.speed = -15;
    }

    return this.speed;
  
  }
}
