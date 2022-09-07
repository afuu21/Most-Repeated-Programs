import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a decimal number: ");
      int dec = sc.nextInt();
      String digits = "0123456789ABCDEF";
      String hex = "";
      while(dec!=0) {
        hex += digits.charAt(dec%16);
        dec/=16;
      }
      StringBuilder ip = new StringBuilder();
      ip.append(hex);
      System.out.println("Hexadecimal Equivalent is "+ ip.reverse());
    }
}
//Output
Enter a decimal number: 267
Hexadecimal Equivalent is 10B
