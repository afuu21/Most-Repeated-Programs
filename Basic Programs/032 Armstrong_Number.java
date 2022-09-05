import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      int n, temp, sum;
      n=temp=sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number: ");
      n = sc.nextInt();
      temp = n;
      while(temp!=0) {
        sum+=Math.pow((temp%10),3);
        temp/=10;
      }
      if(sum==n)
        System.out.println("Armstrong Number!");
      else
        System.out.println("Not Armstrong Number");
  }
}
//Output
Enter the number: 153 
Armstrong Number!

Enter the number: 121 
Not Armstrong Number
