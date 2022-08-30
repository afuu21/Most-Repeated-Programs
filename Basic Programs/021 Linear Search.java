import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = {1,4,5,3,5,6,7,9,10};
      System.out.println("Enter the key to be searched: ");
      int key = sc.nextInt();
      for(int i=0; i<a.length; i++) {
        if(key==a[i]) {
          System.out.println("The elem is found at: " + i);
          return;
        }
      }
      System.out.println("Element is not found!");
  }
}

//Output
Enter the key to be searched: 100
Element is not found!
