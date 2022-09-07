import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a hexadecimal number: ");
      String hex = sc.nextLine();
      int ans=0;
      String digits = "0123456789ABCDEF";
      for(int i=0; i<hex.length(); i++) {
        hex = hex.toUpperCase();
        char c = hex.charAt(i);
        int d = digits.indexOf(c);
        ans =ans*16 + d;
      }
      System.out.println("Decimal Equivalent is "+ ans);
    }
}
//Output
Enter a hexadecimal number: 100
Decimal Equivalent is 256
