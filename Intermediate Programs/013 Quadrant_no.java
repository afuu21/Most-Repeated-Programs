import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Coordinates: ");
      int x = sc.nextInt();
      int y = sc.nextInt();
      String quad="";
      if (x*y > 0) {
        if(x<0)
          quad = "3rd Quadrant";
        else
          quad = "1st Quadrant";
      } else {
        if(x==0 && y==0)
          quad = "Origin";
        else if(x==0)
          quad = "Y-axis";
        else if(y==0)
          quad = "X-axis";
        else if(x<0)
          quad = "2nd Quadrant";
        else if(y<0)
          quad = "4th Quadrant";
      }
      System.out.println(quad);
    }
}
//Output
Enter a Coordinates: 0 0
Origin
