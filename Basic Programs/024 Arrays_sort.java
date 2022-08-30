import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = {1,4,5,3,5,6,7,9,10};
      System.out.println("Array is: "+ Arrays.toString(a));
      Arrays.sort(a);
      System.out.println("Sorted Array is: " + Arrays.toString(a));
  }
}
