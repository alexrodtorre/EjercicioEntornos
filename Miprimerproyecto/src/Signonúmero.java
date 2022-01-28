/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */import java.util.Scanner;

/**
 *
 * @author rodtoral
 */
public class Signonúmero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        
        if(num==0){
            System.out.println("El numero es 0");
        } else if (num > 0){
            System.out.println("El numero es positivo");
        } else if (num < 0){ //se puede quitar el if y dejar solo el else
            System.out.println("El numero es negativo");
        }           
    }
    
    
}
