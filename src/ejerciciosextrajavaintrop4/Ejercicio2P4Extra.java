package ejerciciosextrajavaintrop4;

import java.util.Scanner;

public class Ejercicio2P4Extra {

//    Escriba un programa que averigüe si dos vectores de N enteros son iguales
//    (la comparación deberá detenerse en cuanto se detecte alguna diferencia
//    entre los elementos).
    public static void main(String[] args) {
        int[] vector1 = new int[4];
        int[] vector2 = new int[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los valores del vector1");
        for (int i = 0; i < vector1.length; i++) {
            int num1 = sc.nextInt();
            vector1[i] = num1;
        }
        System.out.println("Ingrese los valores del vector2");
        for (int i = 0; i < vector2.length; i++) {
            int num2 = sc.nextInt();
            vector2[i] = num2;
        }
        boolean igual = true;
        int cont = 0;

        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                cont++;
                if (cont != 0) {
                    i = vector1.length;
                    igual = false;
                } else {
                    igual = true;
                }
            }

        }

        System.out.println("igual = " + igual);
        System.out.println("cont = " + cont);

    }

}
