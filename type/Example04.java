public class Example04 {
  public static void main (String[] args) {
    String badHaiku = "古池屋　蛙飛び込む　水の音"
    String goodHaiku = badHaiku.replace("古池屋", "古池や")
    System.out.println(goodHaiku)
  }
}
