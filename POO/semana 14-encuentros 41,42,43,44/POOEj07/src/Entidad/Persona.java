/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class Persona {
   /*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:*/
    
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    
    // Un constructor por defecto.

    public Persona() {
    }
    
    // Un constructor con todos los atributos como parámetro.

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    // Métodos getters y setters de cada atributo.

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje*/
    
    public void crearPersona(){
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el sexo de la persona (H, M o O)");
        this.sexo=leer.nextLine();
        while(!(this.sexo.equals("H") || this.sexo.equals("M") || this.sexo.equals("O"))){
            System.out.println("Incorrecto, Ingrese el sexo de la persona (H, M o O)");
            this.sexo=leer.nextLine();
        }
        
        System.out.println("Ingrese el nombre de la persona");
        this.nombre=leer.nextLine();
        
        System.out.println("Ingrese la altura de la persona en metros");
        this.altura=leer.nextDouble();
        
        System.out.println("Ingrese la edad de la persona");
        this.edad=leer.nextInt();
        
        System.out.println("Ingrese el peso de la persona");
        this.peso=leer.nextDouble();
        
        
    }
    
    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
    */
    public int calcularIMC(){
        double imc=this.peso/(this.altura*this.altura);
        int valFuncion=0;
        if (imc<20) {
           valFuncion=-1;
        } else if (imc>=20 && imc<=25){
           valFuncion=0; 
        } else if (imc>25){
            valFuncion=1;
        }
        return valFuncion;
    }
    
    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
    */
    
    public boolean esMayorDeEdad(){
        boolean esMayor;
        esMayor=false;
        if (this.edad>=18) {
            esMayor=true;
        }
        return esMayor;
    }
}
