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
public class Ejemplo063 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        String pais;
        String capital;
        String reporte = "";
        

        while (bandera == true) {
            System.out.println("Ingrese País");
            pais = entrada.nextLine();
            reporte = String.format("%s%s",reporte, pais);
            System.out.println("Ingrese la capital del país");
            capital = entrada.nextLine();
            reporte = String.format("%s  %s\n",reporte, capital);
            
            String salir;
            System.out.println("Desea salir del cilo, ingrese si.");
            salir = entrada.nextLine();
                if (salir.equals("si")){
                bandera = false;
            }
        }
        System.out.println(reporte);
    }
}
/*

*/