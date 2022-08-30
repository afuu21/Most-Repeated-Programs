import java.util.*;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int even=0, odd=0;
        while(n!=0) {
            if((n%10)%2==0)
                even++;
            else
                odd++;
            n/=10;
        }
        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}

//Output
Enter a Number: 
17463
Even digits: 2
Odd digits: 3
