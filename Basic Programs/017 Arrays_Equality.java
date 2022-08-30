import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a1[] = {3,4,5,2,7};
      int a2[] = {3,4,5,6,7};
      if(Arrays.equals(a1,a2))
        System.out.print("Arrays are equal!");
      else
        System.out.print("Arrays are not equal!");
  }
}

//Output
Arrays are not equal!
    
//Alternate Method
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a1[] = {3,4,5,6,7};
      int a2[] = {3,4,5,6,7,5,6};
      if(a1.length != a2.length)
        System.out.print("Arrays are not equal!");
      else {
        for(int i=0; i<a1.length; i++) {
          if(a1[i]!=a2[i]) {
            System.out.println("Arrays are not equal!");
            return;
          }
        }
        System.out.println("Arrays are equal!");
      }
  }
}

//Output
Arrays are not equal!
