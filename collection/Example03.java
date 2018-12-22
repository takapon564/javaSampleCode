import java.util.HashSet;

public class Example03 {
  public static void main(String[] args){
    HashSet<Float> sizes = new HashSet<Float>();
    sizes.add(25.5F);
    System.out.println(sizes);

    sizes.add(26.0F);
    System.out.println(sizes);

    sizes.add(25.5F);
    System.out.println(sizes);
  }
}
