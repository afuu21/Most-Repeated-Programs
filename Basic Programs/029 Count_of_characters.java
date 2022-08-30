import java.util.*;
public class Main {
    public static void main(String[] args) {
      String s = "Java is my favourite programming language";
      int len_init = s.length();
      s = s.replace("a","");
      int len_final = s.length();
      System.out.println(len_init-len_final);
  }
}

//Output
6
