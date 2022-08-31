import java.util.*;
public class Main {
    public static void main(String[] args) {
      String s = "My name is Afnan";
      for(int i=0; i<s.length(); i++) {
        char c = s.charAt(i);
        if(c=='A' || c == 'E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
        String s1 = s.substring(0,i);
        String s2 = s.substring(i+1);
        s = s1 + "@" + s2;
        }
      }
      System.out.print(s);
  }
}

//Output
My n@m@ @s @fn@n
