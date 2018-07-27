import java.util.Scanner;

public class IsPrime {
  public static void main(String[] args) {
    int someInt0, someInt1;
    boolean someBool0, someBool1;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    System.out.println("type an integer then press enter:");
    someInt0 = otherthing.nextInt();
    System.out.println("you just entered " + someInt0);

    someInt1 = 2;
    someBool1 = true;
    while(someInt1 != someInt0) {
      if((someInt0 % someInt1) == 0) {
        someBool1 = false;
        someInt1 = someInt0;
      } else {
        someInt1 = someInt1 + 1;
      }
    }
    
    if(someBool1) {
      System.out.println("is prime");
    } else {
      System.out.println("is not prime");
    }
  }
}