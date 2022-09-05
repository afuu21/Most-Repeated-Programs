import java.util.*;
import java.lang.Math;
public class Main {
  public static boolean isPrime(int n) {
    if(n<=1)
      return false;
    else if(n==2)
      return true;
    else if(n%2==0)
      return false;
    for(int i=3; i<=Math.sqrt(n); i++)
      if(n%i==0)
        return false;
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n = sc.nextInt();
    for(int i=2; i<=n; i++)
      if(n%i==0 && isPrime(i))
        System.out.println(i + " ");
  }
}

//Output
Enter n value: 385
5 
7 
11 
