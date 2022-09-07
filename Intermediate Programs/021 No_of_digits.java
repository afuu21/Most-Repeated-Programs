import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no. ");
      int n = sc.nextInt();
      int s=0;
      while(n!=0) {
        s++;
        n/=10;
      }
      System.out.println(s);
    }
}
//Output
Enter the no. 12312
5
