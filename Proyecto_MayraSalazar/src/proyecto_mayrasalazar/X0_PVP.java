/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_mayrasalazar;

/**
 *
 * @author Mayra Salazar
 */
public class X0_PVP {
   boolean  winX;
   boolean win0;
   int countX = 0;
   int count0 = 0;
   String[][] matriz;
   boolean playerChoice;
   
   public X0_PVP(){
       playerChoice = true;
       matriz = new String[3][3];
       for (int i = 0; i < matriz.length; i++) {
           for (int j = 0; j < matriz[i].length; j++) {
               matriz[i][j] = "";
           }
       }
       winX = false;
       win0 = false;
   }
   public void juegoNuevo(){
       new X0_PVP();
   }
   public boolean eleccion(){
       playerChoice = !playerChoice;
       return playerChoice;
   }
   public void mover(){
       
   }
}
