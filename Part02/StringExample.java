public class StringExample {
  public static void main(String[] args) {
    String alice;
    String bobby;
    String s2;

    alice = "beginning StringExample";

    System.out.println(alice);

    alice = "this is the second line";
    bobby = "this is the third line";

    System.out.println(alice);
    System.out.println(bobby);

    bobby = "fou";
    alice = "rth";

    System.out.println(bobby + alice);
    System.out.println(alice + bobby);

    s2 = alice + bobby + alice + "hat";
    
    System.out.println(s2);

    alice = "we got to";
    s2 = " ";
    bobby = "the seventh line";

    System.out.println(alice + s2 + bobby);

    s2 = "we finish with the";
    bobby = "eighth ";

    System.out.println(s2 + " " + bobby + "line");

    s2 = "ninth";
    s2 = s2 + "line";
    s2 = s2 + alice;

    System.out.println(s2);
  }
}