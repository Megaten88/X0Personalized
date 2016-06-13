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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        X0_PVP playPvP = new X0_PVP(); 
        Scanner read = new Scanner(System.in);
        int x;
        int y;
        do{
            playPvP.leerMatriz();
            System.out.println("Ingrese movimiento filas:");
            x = read.nextInt();
            System.out.println("Ingrese movimiento columnas:");
            y = read.nextInt();
            playPvP.mover(x, y);
        }while(playPvP.gameEnd());
    }
}
