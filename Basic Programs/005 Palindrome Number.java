import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int temp=n;
        int rev=0;
        while(temp!=0) {
            rev = rev*10 + temp%10;
            temp/=10;
        }        
    if(rev==n)
        System.out.print("Its a palindrome!");
    else
        System.out.print("Its not a palindrome!");
    }
}

//Output
Enter a Number: 123
Its not a palindrome!
  
Enter a Number: 16461
Its a palindrome!
