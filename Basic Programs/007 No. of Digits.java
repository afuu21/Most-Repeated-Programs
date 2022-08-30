import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int c=0;
        while(n!=0) {
            c++;
            n/=10;
        }
        System.out.println(c);
    }
}

//Output
Enter a Number: 1245
4
  
//Using LOG method()
import java.util.*;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        System.out.println((int)(Math.floor(Math.log10(n)+1)));
    }
}

//Output
Enter a Number: 1532
4
