import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String rev = sb.reverse().toString();
        
        if(s.equals(rev))
            System.out.println("Its a palindrome!");
        else
            System.out.println("Its not a palindrome!");
    }
}

//Output
Enter a String: 
madam
Its a palindrome!

Enter a String: 
apple
Its not a palindrome!
