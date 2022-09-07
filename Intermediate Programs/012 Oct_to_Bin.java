import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Octal number: ");
      int oct = sc.nextInt();
      String bin = "";
      String bin_oct[] = {"000","001","010","011","100","101","110","111"};
      while(oct!=0) {
        bin = bin_oct[oct%10] + bin;
        oct/=10;
      }
      System.out.println("Binary Equivalent is "+ bin);
    }
}
//Output
Enter a Octal number: 37
Binary Equivalent is 011111
