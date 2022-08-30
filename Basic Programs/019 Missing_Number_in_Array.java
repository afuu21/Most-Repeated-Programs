import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a1[] = {1,2,3,4,5,6,7,9,10,11};
      int n = a1.length+1;
      double sum_original = n*(n+1)*0.5;
      int sum_arr=0;
      for(int x:a1)
        sum_arr+=x;
      System.out.println((int)(sum_original-sum_arr));
  }
}
//Output
8
