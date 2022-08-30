//Method 1: Using charAt()
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String rev = "";
        int len = s.length();
        for(int i=len-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("Reverse is: " + rev);
    }
}

//Output
Enter a String: appleT
Reverse is: Telppa

//Method 2: using String Reverse
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String rev = "";
        int len = s.length();
        char a[] = s.toCharArray();
        for(int i=len-1;i>=0; i--)
            rev+=a[i];
        System.out.println("Reverse is: " + rev);
    }
}

//Output
Enter a String: Limited
Reverse is: detimiL

//Method 3: Using StringBuffer class
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        StringBuffer rev;
        int len = s.length();
        StringBuffer sb = new StringBuffer(s);
        rev = sb.reverse();
        System.out.println("Reverse is: " + rev);
    }
}

//Output
Enter a String: apple
Reverse is: elppa

