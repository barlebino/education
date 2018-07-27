import java.util.Scanner;

public class Mountain {
  public static void main(String[] args) {
    String something0;
    String something1;
    String something2;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    something0 = "";
    something2 = "";

    System.out.println("type words then press enter:");
    something1 = otherthing.nextLine();
    System.out.println("you said " + something1);

    something2 = something2 + something1;

    something0 = something1 + something0;

    System.out.println("type words then press enter:");
    something1 = otherthing.nextLine();
    System.out.println("you said " + something1);

    something2 = something2 + " " + something1;

    something0 = something1 + " " + something0;

    System.out.println("type words then press enter:");
    something1 = otherthing.nextLine();
    System.out.println("you said " + something1);

    something2 = something2 + " " + something1;

    something0 = something1 + " " + something0;

    System.out.println("type words then press enter:");
    something1 = otherthing.nextLine();
    System.out.println("you said " + something1);

    something2 = something2 + " " + something1;

    System.out.println("you said " + something2 + " " + something0);

  }
}