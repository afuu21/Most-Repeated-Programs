import java.util.*;
import java.lang.Math;
public class Main {
    public static boolean isPrime(int n) {
      for(int i=2; i<=n/2; i++)
        if(n%i==0)
          return false;
      return true;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      boolean x = true;
      System.out.print("2 ");
      for(int i=3; i<=100; i++) {
        x=isPrime(i);
        if(x)
          System.out.print(i + " ");
      }
    }
}
//Output
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
