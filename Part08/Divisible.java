import java.util.Scanner;

public class Divisible {
  public static void main(String[] args) {
    int someInt0, someInt1, someInt2;
    boolean someBoo0, someBoo1;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    System.out.println("type an integer then press enter:");
    someInt0 = otherthing.nextInt();
    System.out.println("someInt0 is " + someInt0);

    System.out.println("type an integer then press enter:");
    someInt1 = otherthing.nextInt();
    System.out.println("someInt1 is " + someInt1);

    someBoo1 = (someInt1 == 0);

    if(someBoo1) {
      System.out.println("cannot divide by zero");
    } else {
      someInt2 = someInt0 % someInt1;

      someBoo0 = (someInt2 == 0);

      if(someBoo0) {
        System.out.println(someInt0 + " " + "is divisible by" + " " + someInt1);
      } else {
        if(someBoo1) {
          System.out.println("cannot divide by zero");
        } else {
          System.out.println(someInt0 + " " + "is not divisible by" + " " + someInt1);
        } 
      }
    }
  }
}