import java.util.*;
public class Main {
    public static void main(String[] args) {
      Random rand = new Random();
      int r = rand.nextInt(10); //the argument denotes the range 0-9
      System.out.println(r);
  }
}

//Alternate method
import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      System.out.println(Math.random());
  }
}
