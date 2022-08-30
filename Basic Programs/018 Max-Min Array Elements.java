import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a1[] = {4,5,56,7,9,10,11};
      int n = a1.length;
      int max = a1[0];
      int min = a1[0];
      for(int x:a1) {
        if(x>max) max=x;
        else if (x<min) min = x;
      }
      System.out.println("Max: "+max+" Min: "+min);
  }
}

//Output
Max: 56 Min: 4
