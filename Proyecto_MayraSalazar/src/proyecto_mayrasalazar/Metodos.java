/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mayrasalazar;

import java.util.Random;
import javax.swing.JOptionPane;

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
                JOptionPane.showMessageDialog(null, "Correcto, has adivindado una de mis letras");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Awww que lástima, no has adivinado ninguna letra");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Las letras que tenía eran: \n" + leerArray(arrayChar,0));
    }

    public String leerArray(char[] array, int inicioArray) {
        String leerArr = "";
        if (inicioArray == array.length - 1) {
            leerArr += array[inicioArray] + " ";
            return leerArr;
        }
        else{
            leerArr += array[inicioArray] + " ";
            return leerArr + leerArray(array, inicioArray + 1);
        }
    }
    
}
