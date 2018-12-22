import java.util.ArrayList;

class Example02 {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<String>();

    fruits.add("りんご");
    fruits.add("みかん");
    System.out.println(fruits);

    fruits.add("ぶどう");
    System.out.println(fruits);

    fruits.remove("りんご");
    System.out.println(fruits);
    
    fruits.remove(0);
    System.out.println(fruits);

    System.out.println(fruits.get(0));

    fruits.set(0, "メロン");
    System.out.println(fruits);
   }
}
