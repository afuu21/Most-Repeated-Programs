import java.util.*;
public class Main {
    public static void main(String[] args) {
      String s = "$$$$%@112a%%$#44fffv@!!";
      s = s.replaceAll("[^a-zA-Z0-9]","");
      System.out.println(s);
  }
}
//Output
112a44fffv
