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

//Method 2: Using + and -
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping "+a+" "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping "+a+" "+b);
    }
}

//Output
Before Swapping 10 20
After Swapping 20 10

//Method 3: Using * and / NOTE: a and b cannot be 0 in this case
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping "+a+" "+b);
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("After Swapping "+a+" "+b);
    }
}

//Output
Before Swapping 10 20
After Swapping 20 10
    
//Method 4: Using XOR operator The logic is that a^a=0
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping "+a+" "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swapping "+a+" "+b);
    }
}

//Output
Before Swapping 10 20
After Swapping 20 10

//Method 5: Single statement
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping "+a+" "+b);
        b = a+b-(a=b);
        System.out.println("After Swapping "+a+" "+b);
    }
}

//Output
Before Swapping 10 20
After Swapping 20 10
