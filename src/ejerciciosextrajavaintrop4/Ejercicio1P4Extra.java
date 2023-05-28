package ejerciciosextrajavaintrop4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1P4Extra {
//    Realizar un algoritmo que calcule la suma de todos los elementos de un
//    vector de tamaño N, con los valores ingresados por el usuario.

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        n = sc.nextInt();
        int[] vector = new int[n];
        int num;
        int suma = 0;
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < vector.length; i++) {
            num = sc.nextInt();            
            vector[i] = num;   
            suma+=vector[i];
        }
        System.out.println(Arrays.toString(vector));
//        for (int i = 0; i < vector.length; i++) {
//            System.out.print(" [" + vector[i] + " ]");  
//        }
//        System.out.println(" ");
         System.out.println("suma = " + suma);       
    }

}
