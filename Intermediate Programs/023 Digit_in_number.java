import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no. ");
      int n = sc.nextInt();
      System.out.println("Enter the digit: ");
      int digit = sc.nextInt();
      int c=0;
      while(n!=0) {
        if(n%10==digit)c++;n/=10;
      }
      System.out.println(c);
    }
}
//Output
Enter the no. 21223
Enter the digit: 1
1
