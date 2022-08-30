import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      int sum=0;
      System.out.println("Enter the numbers: ");
      for(int i=0; i<n; i++) {
        a[i]=sc.nextInt();
        sum+=a[i];
      }
      System.out.println(sum);
  }
}

//Output
5
Enter the numbers: 1 3 2 4 5
15
