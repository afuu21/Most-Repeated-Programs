import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int fact=1;
      while(n!=1){
        fact*=n--;
      }
      System.out.println(fact);
  }
}

//Using Recursion
import java.util.*;
import java.lang.Math;
public class Main {
    public static int fact(int n) {
      if(n==1)
        return 1;
      return n*fact(n-1);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(fact(n));
  }
}
