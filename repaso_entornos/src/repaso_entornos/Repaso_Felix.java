package repaso_entornos;

import java.util.Scanner;

public class Repaso_Felix {

    public static void main(String[] args) {
        System.out.println("Programa de pares e impares");
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        // Determinar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
        
        // Cerrar el objeto Scanner para evitar fugas de memoria
        scanner.close();
    }
}

