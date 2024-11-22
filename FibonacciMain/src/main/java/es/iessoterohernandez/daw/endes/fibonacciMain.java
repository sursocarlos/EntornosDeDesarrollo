package es.iessoterohernandez.daw.endes;
import java.util.Scanner;

//P  R  O  Y  E  C  T  O
//C  A  R  L  O  S
//F  L  O  R  E  S
//E  N  T  O  R  N  O  S 
//D  E
//D  E  S  A  R  R  O  L  L  O

public class fibonacciMain {
	public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Introduce cuántos números de Fibonacci deseas ver: ");
      int n = scanner.nextInt();

      if (n <= 0) {
          System.out.println("Por favor, introduce un número positivo.");
      } else {
          System.out.println("La sucesión de Fibonacci es:");
          for (int i = 0; i < n; i++) {
              System.out.print(Fibonacci.fibonacci(i) + " ");
          }
      }

		scanner.close();
	}
}
