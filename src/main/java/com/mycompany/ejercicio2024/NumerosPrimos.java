package com.mycompany.ejercicio2024;


public class NumerosPrimos {
    
    public static void MostrarArreglo(int[] Arreglo){
        
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.println(Arreglo[i]);
        }
    }
    
    public static boolean VerificarPrimo(int num){
        
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
    
    public static int[] MostrarNum(int [] Arreglo, boolean primo, int num){
        
        if (primo == true) {
                Arreglo = VerificarArreglo(Arreglo, num);
                System.out.println("El número " + num + " ES PRIMO.");
            }else{
                System.out.println("El número " + num + " No es primo.");
            }
        return Arreglo;
    }
    
    public static int[] VerificarArreglo(int[] Arreglo, int num){
        
        for (int i = 0; i < Arreglo.length; i++) {
            if (num == Arreglo[i]) {
                return Arreglo;
            }
        }
        Arreglo = RehacerArreglo(Arreglo, num);
        return Arreglo;
    }
    
    public static int[] RehacerArreglo(int[] Arreglo, int num){
        
        int [] Arreglob = new int[Arreglo.length];
        if (Arreglo.length > 0) {
            for (int i = 0; i < Arreglob.length; i++) {
                Arreglob[i] = Arreglo[i];
            }
            Arreglo = new int [Arreglo.length + 1];
            for (int i = 0; i < Arreglob.length; i++) {
                Arreglo[i] = Arreglob[i];
            }
            Arreglo[Arreglo.length - 1] = num;
            Arreglob = new int[0];
        }else{
            Arreglo = new int [Arreglo.length + 1];
            Arreglo[Arreglo.length - 1] = num;
        }
        return Arreglo;
    }
    
    public static int[] menorMayor(int[] Arreglo){
        
        for (int i = 0; i < Arreglo.length; i++) {
            int sum = Arreglo[i];
            int indice = i;
            for (int j = i+1; j < Arreglo.length; j++) {
                if (Arreglo[i] > Arreglo[j]) {
                    sum = Arreglo[j];
                    indice = j;
                }
            }
            int num = Arreglo[i];
            Arreglo[i] = sum;
            Arreglo[indice] = num;
        }
        return Arreglo;
    }
    
    public static int[] mayorMenor(int[] Arreglo){
        
        for (int i = 0; i < Arreglo.length; i++) {
            int sum = Arreglo[i];
            int indice = i;
            for (int j = i+1; j < Arreglo.length; j++) {
                if (Arreglo[i] < Arreglo[j]) {
                    sum = Arreglo[j];
                    indice = j;
                }   
            }
            int num = Arreglo[i];
            Arreglo[i] = sum;
            Arreglo[indice] = num;
        }
        return Arreglo;
    }
}
