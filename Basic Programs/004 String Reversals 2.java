//Input: I love C++ programming
//Output1: I evol ++C gnimmargorp
//Output2: gnimmargorp ++C evol I
//Output3: programming C++ love I

//Type1
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String words[] = s.split("\\s");
        int len = words.length;
        StringBuffer sb;
        StringBuffer rev;
        String x="";
        for(int i=0; i<len; i++) {
            sb = new StringBuffer(words[i]);
            rev = sb.reverse();
            x+=rev.toString()+" ";
        }
        System.out.println("Reverse is: " + x);
    }
}

//Output1
Enter a String: I love C++ programming
Reverse is: I evol ++C gnimmargorp 

//Type2
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String words[] = s.split("\\s");
        int len = words.length;
        StringBuffer sb;
        StringBuffer rev;
        String x="";
        for(int i=len-1; i>=0; i--) {
            sb = new StringBuffer(words[i]);
            rev = sb.reverse();
            x+=rev.toString()+" ";
        }
        System.out.println("Reverse is: " + x);
    }
}

//Output2
Enter a String: I love C++ programming
Reverse is: gnimmargorp ++C evol I 

//Type3
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String words[] = s.split("\\s");
        int len = words.length;
        StringBuffer sb;
        StringBuffer rev;
        String x="";
        for(int i=len-1; i>=0; i--) {
            sb = new StringBuffer(words[i]);
            x+=sb.toString()+" ";
        }
        System.out.println("Reverse is: " + x);
    }
}

//Output3
Enter a String: I love C++ programming
Reverse is: programming C++ love I 
