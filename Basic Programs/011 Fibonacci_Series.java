//Method 1: 2 variable approach
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. fibonacci: ");
        int n = sc.nextInt();
        int n1=0, n2=1, sum=0;
        System.out.print("Fibonacci Series: \n");
        System.out.print(n1 + " " + n2);
        for(int i=2; i<=n; i++) {
            sum = n1+n2;
            System.out.print(" " + sum);
            n1=n2;
            n2=sum;
        }
    }
}
//Output
Enter the no. fibonacci: 12
Fibonacci Series: 
0 1 1 2 3 5 8 13 21 34 55 89 144
  
//Method 2: Using Array
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. fibonacci: ");
        int n = sc.nextInt();
        int a[] = new int[n+1];
        a[0]=0; a[1]=1;
        System.out.print("Fibonacci Series: \n");
        System.out.print(a[0] + " " + a[1]);
        for(int i=2; i<=n; i++) {
            a[i] = a[i-2]+a[i-1];
            System.out.print(" " + a[i]);
        }
  }
}
//Output
Enter the no. fibonacci: 
Fibonacci Series: 
0 1 1 2 3 5 8 13 21 34 55 89 144
  
//Method 3: Using Recursion
import java.util.*;
public class Main {
    public static void fib(int n1, int n2, int n) {
      if(n==1)
        return;
      int sum = n1+n2;
      n1=n2;
      n2=sum;
      System.out.print(" "+sum);
      fib(n1,n2,n-1);
    }
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. fibonacci: ");
        int n = sc.nextInt();
        
        System.out.print("Fibonacci Series: \n");
        System.out.print(0 + " " + 1);
        fib(0,1,n);
  }
}

//Output
Enter the no. fibonacci: 
Fibonacci Series: 
0 1 1 2 3 5 8 13 21 34 55 89 144
