/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 import java.util.Scanner;

/**
 *
 * @author rodtoral
 * 
 * 
 * Programa que pide al usuario numeros y
 * contabiliza los que son positivos,negativos y nulos. 
 */

public class ejemplo {
  //PROGRAMA QUE PIDE AL USUARIO NÚMEROS Y CONTABILIZA LOS QUE SON POSITIVOS, NEGATIVOS Y NULOS
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce número1: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Introduce número2: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Introduce número3: ");
        double num3 = sc.nextDouble();
        
        //declaramos contadores
        int positivos = 0;
        int negativos = 0;
        int nulos = 0;
        
        if(num1==0){
            nulos = nulos + 1;                  //también se puede poner nulo++ para incrementar en 1
        }                                       //el signo se puede colocar delante o detrás
        if (num2==0){                           //si se coloca delante se realizará antes de la acción y sino se realizará detrás
            nulos++;
        }
        if (num3==0){
            nulos++;
        }
        if (num1>0){
            positivos = positivos + 1;
        }
        if (num2>0){
            positivos++;
        }
        if (num3>0){
            positivos++;
        }
        if (num1<0){
            negativos = negativos + 1;
        }
        if (num2<0){
            negativos++;
        }
        if (num3<0){
            negativos++;
        }
        
        System.out.println("Hay " + nulos + " números nulos");
        System.out.println("Hay " + positivos + " números positivos");
        System.out.println("Hay " + negativos + " números mnegativos");
    }
}
