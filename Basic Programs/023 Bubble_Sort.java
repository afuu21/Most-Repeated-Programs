import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = {1,4,5,3,5,6,7,9,10};
      System.out.println("Array is: "+ Arrays.toString(a));
      int len = a.length;
      int temp;
      for(int i=0; i<len-1; i++) {
        for(int j=0; j<len-i-1; j++) {
          if(a[j]>a[j+1]) {
            temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
          }
        }
      }
      System.out.println("Sorted Array is: " + Arrays.toString(a));
  }
}

//Output
Array is: [1, 4, 5, 3, 5, 6, 7, 9, 10]
Sorted Array is: [1, 3, 4, 5, 5, 6, 7, 9, 10]
