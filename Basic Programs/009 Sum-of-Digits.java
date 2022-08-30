import java.util.*;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int sum=0;
        while(n!=0) {
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

//Output
Enter a Number: 98759
Sum of digits: 38
