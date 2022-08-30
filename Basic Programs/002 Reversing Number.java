//Method 1: Using Algorithm
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int rev=0;
        while(n!=0) {
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println("Reverse is: " + rev);
    }
}

//Output
Enter a number: 4738
Reverse is: 8374
  
//Method 2: Using StringBuffer Class
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        StringBuffer rev = sb.reverse();
        System.out.println("Reverse is: " + rev);
    }
}

//Output
Enter a number: 
2345
Reverse is: 5432
  
//Method 3: Using StringBuilder Class
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        StringBuilder sbl = new StringBuilder();
        sbl.append(n);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reverse is: " + rev);
    }
}

//Output
Enter a number: 
7658
Reverse is: 8567
