/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Servicio s = new Servicio();
                s.agregaNumero();
                s.mostrarNumeros();
                s.sumaYpromedio();
    }
    }


