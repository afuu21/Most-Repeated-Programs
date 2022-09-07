import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a decimal number: ");
      int dec = sc.nextInt();
      int r=0;
      String oct = "";
      while(dec!=0) {
        r = dec%8;
        oct += String.valueOf(r);
        dec/=8;
      }
      StringBuilder ip = new StringBuilder();
      ip.append(oct);
      System.out.println("Octal Equivalent is "+ ip.reverse());
    }
}
//Output
Enter a decimal number: 214
Octal Equivalent is 326
