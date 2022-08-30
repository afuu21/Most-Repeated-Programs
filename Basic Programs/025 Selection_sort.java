import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = {1,4,5,3,5,6,7,9,10};
      int min = 0;
      int temp;
      for(int i=0; i<a.length; i++) {
        for(int j=i; j<a.length; j++) {
          if(a[min]>a[j])
            min=j;
        }
      temp=a[i];
      a[i] = a[min];
      a[min] = temp;
      min+=1;
      }
      System.out.println("Sorted Array: " + Arrays.toString(a));
  }
}

//Output
Sorted Array: [1, 3, 4, 5, 5, 6, 7, 9, 10]
