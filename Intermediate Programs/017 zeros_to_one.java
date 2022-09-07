import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = String.valueOf(n);
      String ans = "";
      for(int i=0; i<s.length(); i++) {
        if(s.charAt(i)=='0')
          ans+="1";
        else
          ans+=s.charAt(i);
      }
      System.out.println("Ans: " + ans);
    }
}
//Output
Input: 24012
Ans: 24112
