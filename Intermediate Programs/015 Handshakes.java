import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no of people: ");
      int n = sc.nextInt();
      int ans = n*(n-1)/2;
      System.out.println(ans);
    }
}
//Output
Enter the no of people: 30
435
