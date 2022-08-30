//Method 1: Using Third Variable (temp)
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping "+a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping "+a+" "+b);
    }
}
//Output
Before Swapping 10 20
After Swapping 20 10

//Method 2: 
