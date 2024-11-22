package es.iessoterohernandez.daw.endes;

// P  R  O  Y  E  C  T  O
// C  A  R  L  O  S
// F  L  O  R  E  S
// E  N  T  O  R  N  O  S 
// D  E
// D  E  S  A  R  R  O  L  L  O

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}