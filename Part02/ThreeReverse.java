import java.util.Scanner;

public class ThreeReverse {
  public static void main(String[] args) {
    String something0;
    String something1;
    Scanner otherthing;

    otherthing = new Scanner(System.in);

    System.out.println("type words then press enter:");
    something0 = otherthing.nextLine();
    System.out.println("you said " + something0);

    System.out.println("type words then press enter:");
    something1 = otherthing.nextLine();
    System.out.println("you said " + something1);

    something0 = something1 + something0;

    System.out.println("type words then press enter:");
    something1 = otherthing.nextLine();
    System.out.println("you said " + something1);

    System.out.println("you said " + something1 + something0 + something1);
    
  }
}