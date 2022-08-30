import java.util.*;
public class Main {
    public static void main(String[] args) {
      HashSet<Integer>nums = new HashSet();
      int a[] = {1,4,5,3,5,6,7,9,10};
      for(int i=0; i<a.length; i++) {
        if(nums.add(a[i])==false) {
          System.out.println("The duplicate elem is: " + a[i]);
          return;
        }
      }
  }
}
//Output
The duplicate elem is: 5
