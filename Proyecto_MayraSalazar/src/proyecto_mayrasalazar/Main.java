/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mayrasalazar;
import java.util.Scanner;
/**
 *
 * @author Mayra Salazar
 */
public class Main {
    static Metodos metodo = new Metodos();
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Adivina una de mis letras... Adivina:");
        char carac = read.next().charAt(0);
        metodo.encontrarChar(carac);
    }
}
