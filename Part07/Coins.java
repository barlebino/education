import java.util.Scanner;

public class Coins {
  public static void main(String[] args) {
    int someInt0, someInt1, someInt2, someInt3, someInt4, someInt5, someInt6, someInt7, someInt8, someInt9;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    System.out.println("type an integer then press enter:");
    someInt0 = otherthing.nextInt();
    System.out.println("you entered " + someInt0);

    someInt1 = 25;

    // How much quarters you can fit into someInt0
    someInt2 = someInt0 / someInt1;

    System.out.println("you need" + " " + someInt2 + " " + "quarters.");

    // How much money is left over after you apply the quarters.
    someInt3 = someInt0 % someInt1;

    someInt4 = 10;

    // someInt5 is the amount of dimes you can fit into someInt3.
    someInt5 = someInt3 / someInt4;

    System.out.println("you need" + " " + someInt5 + " " + "dimes.");

    // How much money is left over after you apply the dimes.
    someInt6 = someInt3 % someInt4;

    // How do you get what is left over after you apply the dimes to someInt3?

    someInt7 = 5;

    someInt8 = someInt6 / someInt7;

    System.out.println("you need" + " " + someInt8 + " " + "nickels.");

    someInt9 = someInt6 % someInt7;

    System.out.println("you need " + " " + someInt9 + " " + "pennies.");
  }
}