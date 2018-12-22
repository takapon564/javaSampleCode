import java.util.HashMap;

class Example07 {
  public static void main(String[] args) {
    HashMap<String, Integer> records = new HashMap<String, Integer>();

    records.put("japanese", 100);
    records.put("math", 95);
    records.put("science", 98);
    records.put("society", 98);

    System.out.println(records);
  }
}
