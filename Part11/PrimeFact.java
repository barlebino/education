import java.util.Scanner;

public class PrimeFact {
  public static void main(String[] args) {
    int someInt0, someInt1;
    boolean someBool0;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    System.out.println("type an integer then press enter:");
    someInt0 = otherthing.nextInt();
    System.out.println("you just entered " + someInt0);
    
    if(someInt0 == 0 || someInt0 == 1) {
      System.out.println("Error");
      return;
    }

    someInt1 = 2;
    while(someInt1 != someInt0) {
      if((someInt0 % someInt1) == 0) {
        System.out.println(someInt1);
        someInt0 = someInt0 / someInt1;
        someInt1 = 2;
      } else {
        someInt1 = someInt1 + 1;
      }
    }
    System.out.println(someInt1);
  }
}