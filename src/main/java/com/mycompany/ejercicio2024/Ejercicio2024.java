package com.mycompany.ejercicio2024;

import java.util.Scanner;

public class Ejercicio2024 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int sum, opcion;
        NumerosPrimos Arreglo = new NumerosPrimos();
        boolean primo = true;
        
        for (int j = 0; j < 1;) {
            System.out.println("\n------------------------------\n"
                    + "Seleccione una opción númerica:\n"
                    + "1 - Ver por grupo de números.\n"
                    + "2 - Ver por número.\n"
                    + "3 - Ver Arreglo.\n"
                    + "4 - Ordenar de menor a mayor.\n"
                    + "5 - Ordenar de mayor a menor.\n"
                    + "6 - Eliminar un número del arreglo.\n"
                    + "7 - Salir del prg."
                    + "\n------------------------------");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Coloque un número limite:");
                    sum  = leer.nextInt(); 
        
                    for (int i = 0; i < sum + 1; i++) {
                        primo = NumerosPrimos.VerificarPrimo(i);
                        Arreglo.MostrarNum(primo, i);
                    }
                    break;
                case 2:
                    for (int i = 0; i < 1;) {
                        System.out.println("\nColoque un número para saber si es primo. Sino presione 0 para salir:");
                        sum = leer.nextInt();
                        if (sum > 0) {
                            primo = NumerosPrimos.VerificarPrimo(sum);
                            Arreglo.MostrarNum(primo, sum);
                        }else{
                            i++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nLos números primos:");
                    Arreglo.MostrarArreglo();
                    break;
                case 4:
                    Arreglo.menorMayor();
                    System.out.println("\nLos números primos:");
                    Arreglo.MostrarArreglo();
                    break;
                case 5:
                    Arreglo.mayorMenor();
                    System.out.println("\nLos números primos:");
                    Arreglo.MostrarArreglo();
                    break;
                case 6:
                    System.out.println("Seleccione el número que desee eliminar:");
                    Arreglo.MostrarArreglo();
                    sum = leer.nextInt();
                    Arreglo.EliminarPrimo(sum);
                    break;
                case 7:
                    System.out.println("Has salido del prg.");
                    j++;
                    break;
            }
        }
    }
}
