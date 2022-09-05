import java.util.*;
import java.lang.Math;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n = sc.nextInt();
    int sq_n = (int)(Math.pow(n,2));
    while(n!=0) {
      if(n%10 != sq_n%10) {
        System.out.println("Not Automorphic!");
        return;
      }
      n/=10;
      sq_n/=10;
    }
    System.out.println("Automorphic");
  }
}

//Output
Enter the value of n: 25
Automorphic
