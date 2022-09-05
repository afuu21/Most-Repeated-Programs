import java.util.*;
import java.lang.Math;
public class Main {
  public static int divisors_sum(int n) {
    int s = 0;
    for(int i=1; i<n; i++) {
      if(n%i==0)
        s+=i;
    }
    return s;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n = sc.nextInt();
    int sum = divisors_sum(n);
    if(sum==n)
      System.out.println("Perfect number");
    else
      System.out.println("Not Perfect number");
  }
}

//Output
Enter n value: 6
Perfect number
