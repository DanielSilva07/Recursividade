package br.com.danielsilva.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(findElement(70L));

    }

    public static Long findElement(Long elementNumber){

        if (elementNumber <= 1){
            return elementNumber;
        }
        return findElement(elementNumber - 1) + findElement(elementNumber -2 );
    }
}