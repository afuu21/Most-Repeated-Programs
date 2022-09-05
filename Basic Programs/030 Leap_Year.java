import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the year: ");
      int n = sc.nextInt();
      if (n%400==0)
        System.out.println("Leap Year");
      else if(n%4==0 && n%100!=0)
        System.out.println("Leap Year");
      else
        System.out.println("Not a Leap year!");
  }
}

//Output
Enter the year: 2096
Leap Year
Enter the year: 2100
Not a Leap year
