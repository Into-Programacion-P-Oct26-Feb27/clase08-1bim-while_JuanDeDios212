/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Ejemplo061 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;

        while (bandera == true) {
            System.out.println("Estoy en el ciclo");

            int salir;
            System.out.println("Desea salir del cilo, ingrese -100.");
            salir = entrada.nextInt();
            if (salir == -100){
                bandera = false;
            }
        }
    }
}
/*
En este ejercicio estamos haciendo un ciclo while(), pero no tiene un limite 
puesto por el programador, sino que el limite lo decide el usuario, ya que se le 
pregunta al usuario que escriba algo en especifico para que el ciclo se detenga,
por lo que no podemos saber cuantas veces se va a repetir el ciclo.
*/