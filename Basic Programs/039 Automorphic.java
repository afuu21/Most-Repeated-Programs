import java.util.*;
import java.lang.Math;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n = sc.nextInt();
    int temp = n%10;
    if(temp==0 || temp==1 || temp==5 || temp==6)
      System.out.println("Automorphic");
    else
      System.out.println("Not Automorphic");
  }
}

//Output
Enter n value: 8391
Automorphic
