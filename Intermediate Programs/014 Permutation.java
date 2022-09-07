import java.util.*;
import java.lang.Math;
public class Main {
    public static int fact(int n) {
      if (n==1)
        return 1;
      return n*fact(n-1);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value: ");
      int n = sc.nextInt();
      System.out.println("Enter the r value: ");
      int r = sc.nextInt();
      int ans = fact(n)/(fact(n-r));
      System.out.println(ans);
    }
}
//Output
Enter the n value: 5
Enter the r value: 3
60
