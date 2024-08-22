package org.renzocode.Descifrar;

import java.util.Scanner;


public class  Descrifrar {
    /*
        Se trata de pedir por teclado un número válido de DNI y formar una
    cadena que sea el NIF equivalente al DNI; es decir el número del DNI
    más la letra correspondiente.
    La letra del NIF es la que esta almacenada en el índice de un array
    que se corresponde con el resto de dividir el DNI por 23, que es el
    número de letras que se utilizan para la formación del NIF.
    El array de letras de NIF sería el siguiente:
    char letras[] = { ‘T’, ‘R’, ‘W’, ‘A’, ‘G’, ‘M’, ‘Y’, ‘F’, ‘P’,
     ‘D’, ‘X’, ‘B’, ‘N’, ‘J’, ‘Z’, ‘S’,
     ‘Q’, ‘V’, ‘H’, ‘L’, ‘C’, ‘K’, ‘E’ };
    Por simplicidad escribir todo el código en la función main

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite su DNI y su cod verificacion");
//        int DNI = sc.nextInt();
//
//        String dniString = Integer.toString(DNI);
//
//
//        char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
//                'D', 'X', 'B', 'N', 'J', 'Z', 'S',
//                'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
//
//
//
//        for (int i = 0; i < 3; i++) {
//            if (dniString.length() < 8) {
//                System.out.println("Tiene que tener mas de 8 digitos");
//            break;
//            } else {
//                System.out.println("Validado Correctamente");
//            }
//        }
//

                char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
                        'D', 'X', 'B', 'N', 'J', 'Z', 'S',
                        'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

                for (int i = 0; i < 3; i++) { // Hasta 3 intentos
                    System.out.println("Digite su DNI:");
                    int dni = sc.nextInt();

                    // Validar que el DNI tenga 8 dígitos
                    if (Integer.toString(dni).length() != 8) {
                        System.out.println("El DNI debe tener 8 dígitos. Intento " + (i+1) + " de 3.");
                    } else {
                        // Calcular el índice en el array de letras
                        int indice = dni % 23;
                        char letraNIF = letras[indice];
                        String nif = dni + "" + letraNIF;
                        System.out.println("Su NIF es: " + nif);
                        break; // Salir del bucle después de un DNI válido
                    }

                    if (i == 2) {
                        System.out.println("Ha excedido el número de intentos permitidos.");
                    }
                }

                sc.close();
            }
//        }


//    }
}
