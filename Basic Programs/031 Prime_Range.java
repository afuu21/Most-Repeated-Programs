import java.util.*;
import java.lang.Math;
public class Main {
  public static boolean prime_range(int n) {
    if(n<2)
      return false;
    else if(n==2)
      return true;
    else if(n%2==0)
      return false;
    for(int i=3; i<=Math.sqrt(n); i+=2) {
      if(n%i==0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the range: ");
    System.out.println("Lower limit: ");
    int l = sc.nextInt();
    System.out.println("Entert the upper limit: ");
    int u = sc.nextInt();
    while(l<=u) {
      if(prime_range(l))
        System.out.println(l);
      l++;
    }
  }
}

//Output
Enter the range: 
Lower limit: 4
Entert the upper limit: 29
5
7
11
13
17
19
23
29
