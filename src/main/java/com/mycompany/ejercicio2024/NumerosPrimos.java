package com.mycompany.ejercicio2024;


public class NumerosPrimos {
    
    private int[] enteros;

    public NumerosPrimos() {
        this.enteros = new int[0];
    }
    
    public void MostrarArreglo(){
        
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
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
    
    public int[] MostrarNum(boolean primo, int num){
        
        if (primo == true) {
                enteros = VerificarArreglo(num);
                System.out.println("El número " + num + " ES PRIMO.");
            }else{
                System.out.println("El número " + num + " No es primo.");
            }
        return enteros;
    }
    
    public int[] VerificarArreglo(int num){
        
        for (int i = 0; i < enteros.length; i++) {
            if (num == enteros[i]) {
                return enteros;
            }
        }
        enteros = RehacerArreglo(num);
        return enteros;
    }
    
    public int[] RehacerArreglo(int num){
        
        int [] Arreglob = new int[enteros.length];
        if (enteros.length > 0) {
            for (int i = 0; i < Arreglob.length; i++) {
                Arreglob[i] = enteros[i];
            }
            enteros = new int [enteros.length + 1];
            for (int i = 0; i < Arreglob.length; i++) {
                enteros[i] = Arreglob[i];
            }
            enteros[enteros.length - 1] = num;
            Arreglob = new int[0];
        }else{
            enteros = new int [enteros.length + 1];
            enteros[enteros.length - 1] = num;
        }
        return enteros;
    }
    
    public int[] menorMayor(){
        
        for (int i = 0; i < enteros.length; i++) {
            int sum = enteros[i];
            int indice = i;
            for (int j = i+1; j < enteros.length; j++) {
                if (enteros[i] > enteros[j]) {
                    sum = enteros[j];
                    indice = j;
                }
            }
            int num = enteros[i];
            enteros[i] = sum;
            enteros[indice] = num;
        }
        return enteros;
    }
    
    public int[] mayorMenor(){
        
        for (int i = 0; i < enteros.length; i++) {
            int sum = enteros[i];
            int indice = i;
            for (int j = i+1; j < enteros.length; j++) {
                if (enteros[i] < enteros[j]) {
                    sum = enteros[j];
                    indice = j;
                }   
            }
            int num = enteros[i];
            enteros[i] = sum;
            enteros[indice] = num;
        }
        return enteros;
    }
}
