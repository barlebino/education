import java.util.Scanner;

public class Echo {
  public static void main(String[] args) {
    String something;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    System.out.println("type some words then press enter:");
    something = otherthing.nextLine();
    System.out.println("your first words are " + something);

    System.out.println("type some other words then press enter:");
    something = otherthing.nextLine();
    System.out.println("these are your last words " + something);
  }
}