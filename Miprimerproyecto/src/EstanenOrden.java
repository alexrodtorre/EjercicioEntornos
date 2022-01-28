/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
¡
 import java.util.Scanner;
 

/**
 *
 * @author rodtoral
 */
public class EstanenOrden {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce número1: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Introduce número2: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Introduce número3: ");
        double num3 = sc.nextDouble();
        
        if (num1 <= num2 && num2 <= num3){
            System.out.println("Has introducido los números de menor a mayor");
        }else if (num1 >= num2 && num2 >= num3){
            System.out.println("Has introducido los números de mayor a menor");
        }else {
            System.out.println("Has introducido los números desordenados");
        }
    }
}
    }
    
    
}
