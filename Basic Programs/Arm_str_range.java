import java.util.*;
import java.lang.Math;
public class Main {
    public static boolean arm_str(int n) {
      int temp = n;
      int sum=0;
      while(temp!=0) {
        sum+=Math.pow((temp%10),3);
        temp/=10;
      }
      if(sum==n)
        return true;
      else
        return false;
    }
    public static void main(String[] args) {
      int l=0, h=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the range: ");
      l = sc.nextInt();
      h = sc.nextInt();
      while(l<=h) {
        if(arm_str(l))
          System.out.println(l);
        l++;
      }
      
  }
}

//Output
Enter the range: 1 2000
1
153
370
371
407
