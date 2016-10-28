package ordenarnumeros;

import java.util.Scanner;

public class OrdenarNumeros {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int aux;
        int cant = 0;
        
        System.out.println("Introduce la cantidad de números que vas a escribir:");
        
        try {
            cant = scanner.nextInt();
        } catch (NumberFormatException ex) {
            System.out.println(cant+" no es un número.");
            ex.printStackTrace();
        }
        
        int[] nums = new int[cant];
        
        System.out.println("Escribe los "+cant+" números, uno a uno:");
        
        try {
            for (int i = 0; i < cant; i++) {
                nums[i] = scanner.nextInt();
            }  
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        
        
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant; j++) {
                if (nums[i] <= nums[j]) {
                    aux = nums[j];
                    nums[j] = nums[i];
                    nums[i] = aux;
                }
            }
            
        }
        
        System.out.println("Tus números ordenados son:");
        
        for (int i = 0; i < cant; i++) {
            System.out.print(nums[i]+"  ");
        }
        
        System.out.println("");
    }
    
}