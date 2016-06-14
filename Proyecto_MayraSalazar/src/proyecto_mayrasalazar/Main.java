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
        X0_GUI playPvP = new X0_GUI(); 
        Scanner read = new Scanner(System.in);
        int x;
        int y;
        do{
           new X0_GUI();
        }while(playPvP.gameEnd());
    }
}
