/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mayrasalazar;

import java.util.Random;

/**
 *
 * @author Agile
 */
public class Metodos {

    Random r = new Random();

    public char[] charRandom() {
        char[] arrayChar = new char[4];
        char[] arrayCharLetras = new char[]{'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < arrayChar.length; i++) {
            int x = 0 + r.nextInt(arrayCharLetras.length);
            arrayChar[i] = arrayCharLetras[x];
        }
        return arrayChar;
    }

    public void encontrarChar(char carac) {
        char[] arrayChar = charRandom();
        for (int i = 0; i < arrayChar.length; i++) {
            if (Character.toLowerCase(carac) == arrayChar[i]) {
                System.out.println("Correcto, has adivindado una de mis letras");
                break;
            } else {
                System.out.println("Awww que lástima, no has adivinado ninguna letra");
                break;
            }
        }
        System.out.println("Las letras que tenía eran:");
        leerArray(arrayChar);
    }

    public void leerArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + array[i] + "]");
        }
    }
    public int[][] crearMatriz(int[][] matriz){
        int[][] matrizDiagOrdenada = matriz;
        return matriz;
    }
    public void crearMatriz(int x, int y){
        int[][] matriz = new int[x][y];
        
    }
    
}
