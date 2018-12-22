import java.util.HashSet;

public class Example04 {
  public static void main(String[] args){
    HashSet<Float> sizes = new HashSet<Float>();
    sizes.add(25.5F);
    System.out.println(sizes);

    sizes.add(26.0F);
    System.out.println(sizes);

    sizes.remove(25.5F);
    System.out.println(sizes);
  }
}
