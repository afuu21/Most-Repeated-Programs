import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the a, b and c: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      double r1 =0, r2=0, d=0;
      d = b*b-4*a*c;
      if(d==0) {
        r1=r2=-b/2*a;
      } else if (d<0) {
        System.out.println("Roots are imaginary!");
        return;
      } else {
        r1 = -b+Math.sqrt(d)/2*a;
        r2 = -b-Math.sqrt(d)/2*a;
      }
      System.out.println("Roots are: " + r1 + " and " + r2);
    }
}
//Output
Enter the a, b and c: 1 5 3
Roots are: -3.197224362268005 and -6.802775637731995
