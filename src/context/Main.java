package context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Mensaje Inicial
        System.out.println("Ponderación del Estudiante");

        //Arreglo de Notas
        float[] notas = new float[3];
        
        double suma = 0;
        double prom = 0;

        //Ingreso de Datos
        for (int i = 0; i < 3; i++) {
            boolean valido = false;

            while (!valido) {
                try {
                    System.out.print(
                            "Ingrese la calificación #"
                            + (i + 1)
                            + ": "
                    );

                    notas[i] = Float.parseFloat(sc.nextLine());
                    suma += notas[i];

                    valido = true;
                } catch (NumberFormatException e) {
                    System.out.println(
                            "¡ERROR! Ingrese un número válido "
                            + "(Entero o Decimal)"
                    );
                }
            }
        }

        //Promedio
        prom = suma / 3;

        //Resultado
        System.out.println("Promedio: " + prom);

        //Cierre Scanner
        sc.close();
    }
}