import java.util.*;
import java.lang.Math;
public class Main {
    public static void add_frac(int n1, int d1, int n2, int d2) {
      System.out.println("Fract1 = " + n1 + "/" + d1);
      System.out.println("Fract2 = " + n2 + "/" + d2);
      int fn = (n1*d2) + (n2*d1);
      int dn = d1*d2;
      int x = fn>dn ? fn:dn;
      for(int i=2; i<=x; i++) {
        while(fn%i==0 && dn%i==0) {
          fn/=i;
          dn/=i;
        }
      }
      System.out.println("Ans = " + fn + "/" + dn);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n1 and d1: ");
      int n1 = sc.nextInt();
      int d1 = sc.nextInt();
      System.out.println("Enter the n2 and d2: ");
      int n2 = sc.nextInt();
      int d2 = sc.nextInt();
      add_frac(n1,d1,n2,d2);
    }
}
//Output
Enter the n1 and d1: 3 7
Enter the n2 and d2: 8 35
Fract1 = 3/7
Fract2 = 8/35
Ans = 23/35
