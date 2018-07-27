import java.util.Scanner;

public class JustRemainder {
  public static void main(String[] args) {
    int someInt0, someInt1, someInt2;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    System.out.println("type an integer then press enter:");
    someInt0 = otherthing.nextInt();
    System.out.println("someInt0 is " + someInt0);

    System.out.println("type an integer then press enter:");
    someInt1 = otherthing.nextInt();
    System.out.println("someInt1 is " + someInt1);

    someInt2 = someInt0 % someInt1;

    System.out.println("the remainder of someInt0 and someInt1 is " + someInt2);
  }
}