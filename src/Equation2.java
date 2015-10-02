
import java.util.Scanner;

public class Equation2 {
  public static void main(String [] args) {
    Double a;
    Double b;
    Double c;

    Scanner scan = new Scanner(System.in);

    System.out.print("a= ");
    a = scan.nextDouble();
    System.out.print("b= ");
    b = scan.nextDouble();
    System.out.print("c= ");
    c = scan.nextDouble();
    System.out.println("L'équation est: " + a + "x +" + b + "x +" + c );
    Double delta = b * b - 4 * a * c;

    if (delta == 0) {
      Double x = -b / (2 * a);
      System.out.print("La solution est: " + x);
    } else if (delta > 0) {
      Double x1 = (Double)(-b + Math.sqrt(delta))/(2 * a);
      Double x2 = (Double)(-b - Math.sqrt(delta))/(2 * a);
      System.out.print("Les solutions sont: " + x1 + " et " + x2);
    } else if (delta < 0) {
      System.out.println("Il n'y a pas de solution réelle");
    }
  }
}
