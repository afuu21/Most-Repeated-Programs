import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a decimal number: ");
      int dec = sc.nextInt();
      int r=0;
      String bin = "";
      while(dec!=0) {
        r = dec%2;
        bin += String.valueOf(r);
        dec/=2;
      }
      System.out.println("Binary Equivalent is "+ bin);
    }
}
//Output
Enter a decimal number: 23
Binary Equivalent is 11101
