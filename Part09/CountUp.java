import java.util.Scanner;

public class CountUp {
  public static void main(String[] args) {
    int someInt0, someInt1;
    boolean someBool0;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    System.out.println("type an integer then press enter:");
    someInt0 = otherthing.nextInt();
    System.out.println("you just entered " + someInt0);
    System.out.println("");

    someInt1 = 0;
    someBool0 = (someInt1 < 7);

    while(someBool0) {
      System.out.println("You entered " + someInt0);

      someInt1 = someInt1 + 1;
      someBool0 = (someInt1 < 7);
    }
  }
}