import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a octal number: ");
      long a = sc.nextInt();
      int x=0;
      int ans=0;
      while(a!=0) {
        ans=ans+(int)(Math.pow(8,x))*(int)(a%10);
        a/=10;x++;
      }
      System.out.println("Decimal Equivalent is "+ ans);
    }
}
//Output
Enter a octal number: 2001
Decimal Equivalent is 1025
