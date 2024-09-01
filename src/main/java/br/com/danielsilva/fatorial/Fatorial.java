package br.com.danielsilva.fatorial;

public class Fatorial {
    public static void main(String[] args) {

        Long n = 60L;
        System.out.println(encontrarElemento(n));

    }

    public static Long encontrarElemento(Long n){

        if (n == 0){
            return 1L;
        }
        return  n  * Fatorial.encontrarElemento(n-1)  ;
    }
}
