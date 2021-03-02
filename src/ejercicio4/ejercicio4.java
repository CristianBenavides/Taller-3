/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author DAVID BENAVIDES
 */
public class ejercicio4 {
    public static void main (String [] args){
        Scanner entrada=new Scanner(System.in);
        System.out.printf("Digite el numero de empleados a ingresar: ");
        int n=entrada.nextInt();
        //declarando los arreglos
        String [] E =new String[n];
        int [] H =new int[n];
        int [] T =new int[n];
        //declarando las variables usadas
        int sueldo;
        int horas_extras;   
        for (int i = 0; i < n; i++) {
            System.out.printf("Empleado %d%n",i+1);
            System.out.println("Digite el nombre del empleado ");
            E[i]=entrada.next();
            System.out.printf("Digite el numero de horas que %s trabajo: %n",E[i]);
            H[i]=entrada.nextInt();
        }
        System.out.println("Tener en cuenta que la cuota por trabajo normal(40 horas trabajadas) es de $3000 + horas extras (x1.5 de la cuota normal)");
        for (int i = 0; i < n; i++) {
            if (H[i]<40) {
                System.out.printf("%s no trabajò las horas necesarias%n",E[i]);
            } 
            else if (H[i]==40){
            System.out.printf("%s trabajo %d horas por lo tanto su sueldo bruto es de $%d%n",E[i],H[i],3000);
            }
            else {
                horas_extras=H[i]-40;
                sueldo= (4500*horas_extras)+3000;
                System.out.printf("%s trabajo %d horas por lo tanto su sueldo bruto es de %d%n",E[i],H[i],sueldo);
            }
        }
    }

}
