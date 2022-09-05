import java.util.*;
import java.lang.Math;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n = sc.nextInt();
    for(int i=2; i<=n; i++)
      if(n%i==0)
        System.out.println(i);
  }
}

//Output
Enter n value: 72
2
3
4
6
8
9
12
18
24
36
72
