import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = {1,2,3,4,5,6,7,8,9};
      System.out.println("Even numbers: ");
      for(int x:a)
        if(x%2==0)
          System.out.println(x+" ");
      System.out.println("Odd numbers: ");
      for(int x:a)
        if(x%2!=0)
          System.out.println(x+" ");
  }
}

//Output
Even numbers: 
2 
4 
6 
8 
Odd numbers: 
1 
3 
5 
7 
9 
