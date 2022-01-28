/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author rodtoral
 */
public class Tema3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el primer numero");
        double num1=teclado.nextDouble();
        
        System.out.print("Introduce el segundo numero");
        double num2=teclado.nextDouble();
        
        if (num1 % num2 == 0){
            System.out.println("El primer numero es divisible entre el segundo");
        } else 
            System.out.println("El primer numero no es divisible entre el segundo numero");
        }
        
        
        
        
        
    }
}
