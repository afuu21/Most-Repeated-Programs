import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = {1,4,5,3,5,6,7,9,10};
      for(int j=1; j<a.length; j++) {
        int i = j-1;
        int key = a[j];
        while(i>-1 && a[i]>key) {
          a[i+1] = a[i];
          i--;
        }
        a[i+1] = key;
      }
      System.out.println("Sorted Array: " + Arrays.toString(a));
  }
}

//Output
Sorted Array: [1, 3, 4, 5, 5, 6, 7, 9, 10]
