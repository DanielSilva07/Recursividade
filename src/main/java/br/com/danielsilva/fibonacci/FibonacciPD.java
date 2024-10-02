package br.com.danielsilva.fibonacci;

// Sequencia de Fibonacci com Progamaçao Dinamica

public class FibonacciPD {

    private static final Long MAX_ELEMENTOS = 100L;
    private static final Long[] fib_Elementos = new Long[Math.toIntExact(MAX_ELEMENTOS)];


    public static void main(String[] args) {
        int n = 20;
        System.out.println(encontrarElementoPD(n));

    }

    public static Long encontrarElementoPD(int n) {
        for (int i = 0; i < MAX_ELEMENTOS; i++) {
            fib_Elementos[i] = (long) -1;
        }
        return encontrarElementos(n);

    }

    public static Long encontrarElementos(int n) {
        if (fib_Elementos[n] == -1) {
            if (n <= 1) {
                fib_Elementos[n] = (long) n;
            } else {
                fib_Elementos[n] = encontrarElementos(n - 1) + encontrarElementos(n - 2);
            }
        }

        return fib_Elementos[n];
    }

 }
