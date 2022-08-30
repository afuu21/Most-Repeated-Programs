import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a[] = {1,4,5,3,5,6,7,9,10};
      System.out.println("Enter the key to be searched: ");
      int key = sc.nextInt();
      int len = a.length;
      int high=len-1;
      int low=0;
      int mid=low+(high-low)/2;
      while(low<=high) {
        mid=low+(high-low)/2;
        if(key==a[mid]) {
          System.out.println("Key is found at: "+mid);
          return;
        } else if(key<a[mid]) {
          high=mid-1;
        } else low=mid+1;
      }
      System.out.println("Element is not found!");
  }
}

//Output
Enter the key to be searched: 5
Key is found at: 4
