import java.util.*;
import java.lang.Math;
public class Main {
    public static int power(int n, int p) {
      if(p==0)
        return 1;
      return n*power(n,p-1);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number and power: ");
      int n = sc.nextInt();
      int p = sc.nextInt();
      System.out.print("Ans = " + power(n,p));
    }
}
//Output
Enter the number and power: 7 3
Ans = 343
