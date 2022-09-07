import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the two numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int ans=0;
      int max = a>b ? a : b;
      for(int i=max; i<=a*b; i+=max){
        if(i%a==0 && i%b==0) {
          ans = i;
          break;
        }
      }
      System.out.println("LCM of a and b is: "+ ans);
    }
}
//Output
Enter the two numbers: 24 56
LCM of a and b is: 168
