import java.util.*;
import java.lang.Math;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n = sc.nextInt();
    System.out.println("Enter the power: ");
    int p = sc.nextInt();
    int _x = p;
    int x = n;
    while(_x!=1) {
      n*=x;
      _x--;
    }
    System.out.println(n);
  }
}

//Output
Enter n value: 2
Enter the power: 7
128
