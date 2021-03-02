/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAVID BENAVIDES
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.printf("Digite el numero de datos a ingresar: ");
        int n=entrada.nextInt();
        //declarando los arreglos
        String [] a =new String[n];
        int [] b =new int[n];
        int [] c =new int[n];
        //declarando las variables usadas
        int ganancias=0;
        int p_vendidos=0;
        int p_mas_vendido=0;
        int p_mas_costoso=0;
        
        for (int i=0;i<n;i++){
            System.out.printf("Producto %d%n",i+1);
            System.out.print("Digite el codigo del producto: ");
            a[i]=entrada.next();
            System.out.println("Digite el valor del producto: ");
            b[i]=entrada.nextInt();
            System.out.println("Digite la cantidad de unidades vendidas del producto: ");
            c[i]=entrada.nextInt();
        }
        for (int i=0;i<n;i++){//ciclo para sumar la cantidad de productos vendidos
            p_vendidos+=c[i];
        }
        for (int i = 0; i < n; i++) {//ciclo para saber las ganancias
                ganancias+=b[i];
        }
        for (int i = 0; i < n; i++) {
            if (c[i]>p_mas_vendido) {
                p_mas_vendido=i;//guardando la posicion 
            }
        }
        for (int i = 0; i < n; i++) {
            if (b[i]>p_mas_costoso) {
                p_mas_costoso=i;//guardando la posicion 
            }            
            
        }
        System.out.println("El numero total de productos vendidos es "+p_vendidos);
        System.out.printf("%nEl total de ganancias $"+ganancias);
        System.out.printf("%nEl producto mas costoso vendido es %s con un precio de $%d",a[p_mas_costoso],b[p_mas_costoso]);
        System.out.printf("%nEl producto mas vendido es %s con un total de %d unidades vendidas%n",a[p_mas_vendido],c[p_mas_vendido]);
        
    }
    
}
