import java.util.*;
import java.lang.Math;
public class Main {
    public static int count_factors(int n) {
      int c=0;
      for(int i=1; i<=n; i++) {
        if(n%i==0)
          c++;
      }
      return c;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no. ");
      int n = sc.nextInt();
      System.out.println("Enter the no of divisors: ");
      int divisors = sc.nextInt();
      int c=0;
      for(int i=1; i<=n; i++) {
        if(divisors == count_factors(i))
          c++;
      }
      System.out.println(c);
    }
}
//Output
Enter the no. 100
Enter the no of divisors: 3
4
