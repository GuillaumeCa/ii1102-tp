
import java.util.Scanner;

public class Pave {
  public static void main(String [] args) {

    long a;
    long b;
    long c;

    /**
    *  Declaration d'un scanner pour lire des donnees depuis la console
    */
    Scanner scan = new Scanner(System.in);
    System.out.print("a = ");
    a = scan.nextLong(); // Lecture d'un entier long
    while (a < 0) {
      System.out.print("Nombre négatif, réessayez:");
      a = scan.nextLong();
    }
    System.out.print("b = ");
    b = scan.nextLong();
    while (b < 0) {
      System.out.print("Nombre négatif, réessayez:");
      b = scan.nextLong();
    }
    System.out.print("c = ");
    c = scan.nextLong();
    while (c < 0) {
      System.out.print("Nombre négatif, réessayez:");
      c = scan.nextLong();
    }

    long volume = a * b * c;


    System.out.println("Le volume est: " + volume);

  }
}
