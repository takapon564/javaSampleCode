import ch13.Person;

public class Main {
  public static void main(String[] args) {
    
    Person taro = new Person("Taro", 23);
    Person hanako = new Person("Hanako", 12);

    System.out.println(taro.name);
    System.out.println(hanako.name);
  }
}
