package com.mycompany.ejercicio2024;

import java.util.Scanner;

public class Ejercicio2024 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int sum, opcion;
        int Arreglo [] = new int [0];
        boolean primo = true;
        
        for (int j = 0; j < 1;) {
            System.out.println("\n------------------------------\n"
                    + "Seleccione una opción númerica:\n"
                    + "1 - Ver por grupo de números.\n"
                    + "2 - Ver por número.\n"
                    + "3 - Ver Arreglo.\n"
                    + "4 - Ordenar de menor a mayor.\n"
                    + "5 - Ordenar de mayor a menor.\n"
                    + "6 - Salir del prg."
                    + "\n------------------------------\n");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Coloque un número limite:");
                    sum  = leer.nextInt(); 
        
                    for (int i = 0; i < sum + 1; i++) {
                        primo = NumerosPrimos.VerificarPrimo(i);
                        Arreglo = NumerosPrimos.MostrarNum(Arreglo, primo, i, Arreglo.length);
                    }
                    break;
                case 2:
                    for (int i = 0; i < 1;) {
                        System.out.println("\nColoque un número para saber si es primo. Sino presione 0 para salir:");
                        sum = leer.nextInt();
                        if (sum > 0) {
                            primo = NumerosPrimos.VerificarPrimo(sum);
                            Arreglo = NumerosPrimos.MostrarNum(Arreglo, primo, sum, Arreglo.length);
                        }else{
                            i++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nLos números primos:");
                    NumerosPrimos.MostrarArreglo(Arreglo);
                    break;
                case 4:
                    Arreglo = NumerosPrimos.menorMayor(Arreglo);
                    break;
                case 5:
                    Arreglo = NumerosPrimos.mayorMenor(Arreglo);
                    break;
                case 6:
                    System.out.println("Has salido del prg.");
                    j++;
                    break;
            }
        }
    }
}
