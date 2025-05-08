/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.cristhianvalencia2025;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class CristhianValencia2025 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] dia = new int[7];

        double temperatura = 0, caluroso = 0, promedio = ;
        int suma;
        double rango;
        int diasEncimaPromedio = 0;
        int a -30;
        int  b 50;
        
        
        System.out.println("Ingrese  el promedio semanal");
        for (int i = 0; i < 7; i++) {

            System.out.println("putuacion diaria" + (i + 1) + ":");
            dia[i] = Scanner.nextDouble();

        }

        int opcion;
        do {

            System.out.println("Calcular elpromdio semanal de temperatura");
            System.out.println("Mostrar cuantos dias estuvieron por encima del promedio");
            System.out.println("Indicar el dia mas caluroso y el mas frio");
            System.out.println("Mostrar la suma de temperatura de los primeros tres y los ultimos tres dias");
            System.out.println("Salir");
            System.out.println("Selecciones una opcion");

            opcion = ();

            switch (promedio) {
                case 1:

                    System.out.println("calcular el promedio:" + temperatura);
                    a = sc.nextInt();

                    System.out.println(" Ingrese el segundo numero");
                    int = e.nextInt();
                    promedio = a + b;

                    System.out.println("el promedio es :" + promedio);

                case 2:

                    System.out.println("Mostrar dias:" + diasEncimaPromedio);
                    a = sc.nextInt();

                    System.out.println(" Ingrese el segundo numero");
                    b = sc.nextInt();
                    dia = a + b;

                    System.out.println("el dia por el encima del promedio es :" + dia);

                case 3:

                    System.out.println("el dia mas caluroso y el mas frio:" + caluroso);
                    a = sc.nextInt();

                    System.out.println(" Ingrese el segundo numero");
                    b = sc.nextInt();
                    dias = a + b;

                    System.out.println("el promedio es :" + dias);

                case 4:

                    System.out.println("la suma de temperatura de los tres prmeros dias es :" + suma);
                    a = sc.nextInt();

                    System.out.println(" Ingrese el segundo numero");
                    b = sc.nextInt();
                    suma = a + b;

                    System.out.println(" la suma es  :" + suma);

                    break;
                default:
                    
                    System.out.println("salir");

            }
        }
