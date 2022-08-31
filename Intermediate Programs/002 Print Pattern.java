* 
* * 
* * * 
* * * * 
* * * * * 
  
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value: ");
      int n = sc.nextInt();
      for(int i=0; i<n; i++) {
        for(int j=0; j<=i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
  }
}

     *
    * *
   * * *
  * * * *
 * * * * *
 
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value: ");
      int n = sc.nextInt();
      int k=0;
      for(int i=1; i<=n; i++) {
        for(int j=4; j>=i; j--) {
          System.out.print(" ");
        }
        for(k=1; k<=i; k++) {
          System.out.print(" *");
        }
        System.out.println();
      }
  }
}

*   *
 * * 
  *  
 * * 
*   *

import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value: ");
      int n = sc.nextInt();
      int i,j;
      for(i=0; i<n; i++) {
        for(j=0; j<n; j++) {
          if(i==j || i+j == n-1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
  }
}

    *
   **
  ***
 ****
*****

import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the n value: ");
      int n = sc.nextInt();
      int i,j;
      for(i=0; i<n; i++) {
        for(j=0; j<n; j++) {
          if(i+j>=4)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
  }
}

