import java.util.*;
public class Main {
    public static int hcf(int a, int b) {
      if(b%a==0)
        return a;
      return hcf(b%a,a);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the two numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int ans;
      if (a<b)
        ans = hcf(a,b);
      else
        ans = hcf(b,a);
      System.out.println("HCF of a and b is: "+ ans);
    }
}

//Output
Enter the two numbers: 24 56
HCF of a and b is: 8
