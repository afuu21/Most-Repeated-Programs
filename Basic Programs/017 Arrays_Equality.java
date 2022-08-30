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
