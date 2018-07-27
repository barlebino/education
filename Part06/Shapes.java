import java.util.Scanner;

public class Shapes {
  public static void main(String[] args) {
    int someInt0;
    int someInt1;
    int someInt2;
    int someInt3;
    String someString;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    someString = "you enter ";

    System.out.println("type a width then press enter:");
    someInt0 = otherthing.nextInt();
    System.out.println(someString + someInt0);

    System.out.println("type a height then press enter:");
    someInt1 = otherthing.nextInt();
    System.out.println(someString + someInt1);

    someInt2 = someInt0 * someInt1;

    someInt3 = (someInt0 + someInt1) * 2;

    System.out.println("The area is " + someInt2);

    System.out.println("The perimeter is " + someInt3);
  }
}