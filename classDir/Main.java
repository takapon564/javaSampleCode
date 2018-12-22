import tmp.Car;

class Main {
  public static void main(String[] args) {
    Car car = new Car();

    int result = car.speedUp(50);
    System.out.println(result);

    int result1 = car.speedDown(10);
    System.out.println(result1);
  }
}
