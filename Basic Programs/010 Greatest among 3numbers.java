//Method 1: Using ternary operator
import java.util.*;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=90, b=40, c=30;
        int greatest = a>b ? (a>c ? a:c) : (b>c ? b:c);
        System.out.println(greatest);
    }
}
//Output
90

//Alternate method (if-else)
import java.util.*;
import java.lang.Math;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=10, b=40, c=90;
        int greatest;
        if(a>b && a>c)
            greatest = a;
        else if (b>a && b>c)
            greatest = b;
        else
            greatest = c;
        System.out.println(greatest);
    }
}

//Output
90
