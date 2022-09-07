import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a binary number: ");
      String bin = sc.nextLine();
      int oct = 0;
      if(bin.length()%3==1){
        bin = "00"+bin;
      } else if (bin.length()%3==2) {
        bin = "0"+bin;
      }
      String bin_to_oct[] = {"000","001","010","011","100","101","110","111"};
      int ind=0;
      for(int i=3; i<=bin.length(); i+=3) {
        String s = bin.substring(i-3,i);
        ind = Arrays.asList(bin_to_oct).indexOf(s);
        oct = oct*10 + ind;
      }
      System.out.println("Octal Equivalent is "+ oct);
    }
}
//Output
Enter a binary number: 001010100
Octal Equivalent is 124
