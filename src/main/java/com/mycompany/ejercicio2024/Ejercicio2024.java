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
                    + "4 - Salir del prg.");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Coloque un número limite:");
                    sum  = leer.nextInt(); 
        
                    for (int i = 0; i < sum + 1; i++) {
                        primo = nrsPrimo(i);
                        Arreglo = MostrarNum(Arreglo, primo, i, Arreglo.length);
                    }
                    break;
                case 2:
                    for (int i = 0; i < 1;) {
                        System.out.println("\nColoque un número para saber si es primo. Sino presione 0 para salir:");
                        sum = leer.nextInt();
                        if (sum > 0) {
                            primo = nrsPrimo(sum);
                            Arreglo = MostrarNum(Arreglo, primo, sum, Arreglo.length);
                        }else{
                            i++;
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nLos números primos:");
                    MostrarArreglo(Arreglo);
                    break;
                case 4:
                    System.out.println("Has salido del prg.");
                    j++;
                    break;
            }
        }
    }
    
    public static boolean nrsPrimo(int num){
        
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {   
                return false;
            }
        }
        return true;
    }
    
    public static int[] MostrarNum(int [] Arreglo, boolean primo, int num, int contador){
        
        if (primo == true) {
                Arreglo = RehacerArreglo(Arreglo, contador, num);
                System.out.println("El número " + num + " ES PRIMO.");
            }else{
                System.out.println("El número " + num + " No es primo.");
            }
        return Arreglo;
    }
    
    public static void MostrarArreglo(int[] Arreglo){
        
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.println(Arreglo[i]);
        }
    }
    
    public static int[] RehacerArreglo(int[] Arreglo, int cont, int num){
        
        int [] Arreglob = new int[cont];
        if (cont > 0) {
            for (int i = 0; i < Arreglob.length; i++) {
                Arreglob[i] = Arreglo[i];
            }
            Arreglo = new int [cont + 1];
            for (int i = 0; i < Arreglob.length; i++) {
                Arreglo[i] = Arreglob[i];
            }
            Arreglo[cont] = num;
            Arreglob = new int[0];
        }else{
            Arreglo = new int [cont + 1];
            Arreglo[cont] = num;
        }
        return Arreglo;
    }
}
