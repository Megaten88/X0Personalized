/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mayrasalazar;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayra Salazar
 */
public class Main {

    static Metodos metodo = new Metodos();
    static X0_GUI X0 = new X0_GUI();

    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        int opcion;
        do {
            String opcionUser = JOptionPane.showInputDialog(null, "Menu\n" + "1)Adivina la letra\n" + "2)Indice de Masa Corporal\n" + "3)Snake\n" + "4)X0\n" + "5)Salir\n" + "Elija una opción:\n");
            opcion = Integer.parseInt(opcionUser);
            switch (opcion) {
                case 1:
                    String letraUser = JOptionPane.showInputDialog(null, "Adivina una letra de las que tengo:");
                    char eleccion = Character.toLowerCase(letraUser.charAt(0));
                    metodo.encontrarChar(eleccion);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Advertencia:\n Este programa se hará en consola.");
                    char resp = 's';
                    int ob = 0,
                     des = 0;
                    double accOb = 0;
                    double accDes = 0;
                    System.out.println("Este es un programa de medida de índice de masa corporal");
                    while (resp == 'S' || resp == 's') {
                        System.out.print("Ingrese nombre de la persona:\n");
                        String nombre = read.next();
                        System.out.println("Ingrese su peso en kilogramos: ");
                        float peso = read.nextFloat();
                        System.out.println("Ingrese su estatura en metros:");
                        float metros = read.nextFloat();
                        if (peso <= 0 || metros <= 0) {
                            System.out.println("Por favor ingrese valores mayores a 0");
                        } else {
                            float bmi = indiceMasaCorporal(peso, metros);
                            if (bmi >= 0 && bmi <= 18.99) {
                                System.out.printf("La persona %s pesa %.2f y está desnutrida\n", nombre, bmi);
                                des++;
                                accDes += bmi;
                            } else if (bmi >= 19.00 && bmi < 25.00) {
                                System.out.printf("La persona %s pesa %.2f y está saludable\n", nombre, bmi);
                            } else {
                                System.out.printf("La persona %s pesa %.2f y tiene sobrepeso\n", nombre, bmi);
                                ob++;
                                accOb += bmi;
                            }
                        }
                        System.out.println("Desea ingresar otro paciente?[s/n]");
                        resp = read.next().charAt(0);
                    }
                    double promOb = promedioBMI(accOb, ob);
                    double promDes = promedioBMI(accDes, des);
                    System.out.printf("Hay %d personas desnutridas y el índice de masa corporal promedio de las personas desnutridas es %.2f\n", des,promDes);
                    System.out.printf("Hay %d con sobrepeso y el índice de masa corporal promedio de las personas desnutridas es %.2f\n", ob, promOb);
                    
                    break;
                case 3:
                    new SnakeGame();
                    break;
                case 4:
                    String[] arg = {};
                    X0.main(arg);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Salió del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción inválida");
            }
        } while (opcion > 0 && opcion < 5);
    }

    public static float indiceMasaCorporal(float peso, float metros) {
        return peso / (float) (Math.pow(metros, (int) 2));
    }
    public static double promedioBMI(double accumulador, int numPersonas){
        return accumulador/numPersonas;
    }
}
