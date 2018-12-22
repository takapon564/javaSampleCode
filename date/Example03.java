import java.util.GregorianCalendar;
import java.util.Date;

public class Example03 {
  public static void main(String[] args){
    GregorianCalendar calendar = new GregorianCalendar();
    Date today = calendar.getTime();
    System.out.println(today);
  }
}
