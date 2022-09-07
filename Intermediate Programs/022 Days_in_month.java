import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the month no. ");
      int n = sc.nextInt();
      if(n<1 || n>12) {
        System.out.println("Invalid Month!");
      } else if(n==2) {
        System.out.println("28");
      } else if (n<8) {
        if(n%2!=0)
          System.out.println("31");
        else
          System.out.println("30");
      } else if(n%2==0) {
        System.out.println("31");
      } else {
        System.out.println("30");
      }
      
    }
}
//Output
Enter the month no. 11
30
