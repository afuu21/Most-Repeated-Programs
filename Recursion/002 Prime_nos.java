import java.util.*;
import java.lang.Math;
public class Main {
    public static boolean prime(int n, int i) {
      if(i==1)
        return true;
      if(n%i==0)
        return false;
      return (prime(n,i-1));
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      int n = sc.nextInt();
      System.out.print(prime(n,(int)Math.sqrt(n)));
    }
}
//Output
Enter the number: 47
true
