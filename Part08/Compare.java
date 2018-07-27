import java.util.Scanner;

public class Compare {
  public static void main(String[] args) {
    int someInt0, someInt1;
    boolean someBool0, someBool1, someBool2, someBool3, someBool4;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    System.out.println("type an integer then press enter:");
    someInt0 = otherthing.nextInt();
    System.out.println("you entered " + someInt0);

    System.out.println("type an integer then press enter:");
    someInt1 = otherthing.nextInt();
    System.out.println("you entered " + someInt1);

    // Booleans are either "true" or "false"
    // someBool0 will be "true" if someInt0 is greater than someInt1
    // someBool0 will be "false" if someInt0 is less than or equal to someInt1
    someBool0 = (someInt0 > someInt1);

    // If someBool0 is true, then do what is inside of the curly braces
    if(someBool0) {
      System.out.println("the first number is greater than the second number");
    } else {
      System.out.println("the second number is greater than or equal to the first number");
    }

    // Check if the two numbers are equal
    // The double equals is like "<" and ">"
    // "==" is different from "="
    someBool1 = (someInt0 == someInt1);

    if(someBool1) {
      System.out.println("the numbers are equal");
    }

    // Check if both numbers are greater than or equal to zero
    someBool2 = (someInt0 >= 0);
    someBool3 = (someInt1 >= 0);
    // Only if both someBool2 AND (&&) someBool3 are "true", then
    // someBool4 will be "true"
    someBool4 = (someBool2 && someBool3);

    if(someBool4) {
      System.out.println("both numbers are greater than or equal to 0");
    }
  }
}