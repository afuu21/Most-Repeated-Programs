import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a binary number: ");
      long a = sc.nextInt();
      int ans=0;
      int x=0;
      while(a!=0) {
        if(a%10!=0){
          ans+=Math.pow(2,x);
        }
        x++;a/=10;
      }
      System.out.println("Decimal Equivalent is "+ ans);
    }
}
//Output
Enter a binary number: 1011100
Decimal Equivalent is 92
