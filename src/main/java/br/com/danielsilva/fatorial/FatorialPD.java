package br.com.danielsilva.fatorial;

import java.math.BigInteger;

public class FatorialPD {

    public static void main(String[] args) {

        int n = 70;

        System.out.println(fatorial(n));

    }

    public static Long fatorial(int n){
         Long [] fact =  new Long[100];

       fact[0] = 1L;
       fact[1] = 1L;

        for (int i = 1; i <= n ; i++){
            fact[i] = i * fact[ i - 1];
        }
        return fact[n];

    }

}
