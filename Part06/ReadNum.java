import java.util.Scanner;

public class ReadNum {
  public static void main(String[] args) {
    int someInt
    int otherInt, thirdInt;
    String someString;
    Scanner otherthing;

    otherthing = new Scanner(System.in);
    someString = "you entered ";

    System.out.println("type an integer then press enter:");
    someInt = otherthing.nextInt();
    System.out.println(someString + someInt);
    thirdInt = 10;
    otherInt = someInt + thirdInt;
    System.out.println("plus 10 is " + otherInt);
    thirdInt = thirdInt - 4 - 4;
    otherInt = someInt - thirdInt;
    System.out.println("minus 2 is " + otherInt);
    thirdInt = thirdInt + 1;
    otherInt = someInt * thirdInt;
    System.out.println("times 3 is " + otherInt);
    thirdInt = thirdInt * (1 + 1);
    otherInt = someInt / thirdInt;
    thirdInt = someInt % thirdInt;
    System.out.println("divided by 6 is " + otherInt + " remainder " + thirdInt);
  }
}