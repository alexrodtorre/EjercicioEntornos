/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 import java.util.Scanner;
 
/**
 *
 * @author rodtoral
 */
public class MiNota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una nota entre 1 y 100 ");
        int n1=teclado.nextInt();
        
        System.out.println("introduce una nota entre 1 y 100 ");
        int n2=teclado.nextInt();
        
        System.out.println("introduce una nota entre 1 y 100 ");
        int n3=teclado.nextInt();
        
        System.out.println("introduce una nota entre 1 y 100 ");
        int n4=teclado.nextInt();
        
        double media=(n1 + n2 +n3 +n4) /4.0;
        
        if (media >= 0 && media <=59){
                System.out.println(Tu calificación es E);
        } else if (media >=60 && media <=69){
            System.out.println("Tu calificaciçon es D");
        } else if (media >=70 && media <=79){
            System.out.println("Tu calificación es C");
        } else if (media >=80 && media <=89){
            System.out.println("Tu calificación es B");
        } else if (media >=90 && media <=100){
            System.out.println("Tu calificación es A");
            }
        }
        
        
        
    }
    
    
    
    
    
}
