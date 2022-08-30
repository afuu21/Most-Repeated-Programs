import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        
        int i=3;
        while(i<Math.sqrt(n)) {
          if(n%i==0) {
            System.out.println("Not a Prime!");
            return;
          }
          i++;
        }
        System.out.println("Prime Number!");
  }
}

//Output
Enter the no: 79
Prime Number!
