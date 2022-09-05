import java.util.*;
import java.lang.Math;
public class Main {
  public static int fact(int n) {
    if(n==1)
      return 1;
    return n*fact(n-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n = sc.nextInt();
    int sum = 0;
    int temp = n;
    while(temp!=0) {
      sum+=fact(temp%10);
      temp/=10;
    }
    if(sum==n)
      System.out.println("Strong number");
    else
      System.out.println("Not Strong number");
  }
}

//Output
Enter n value: 145
Strong number
