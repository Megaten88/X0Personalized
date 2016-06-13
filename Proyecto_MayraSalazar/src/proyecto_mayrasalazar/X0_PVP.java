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

    boolean empate;
    boolean winX;
    boolean win0;
    int countX = 0;
    int count0 = 0;
    String[][] matriz;
    int vidaX = 100;
    int vida0 = 100;
    boolean playerChoice;

    public X0_PVP() {
        playerChoice = true;
        matriz = new String[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ".";
            }
        }
        winX = false;
        win0 = false;
    }

    public void juegoNuevo() {
        new X0_PVP();
    }

    public boolean eleccion() {
        playerChoice = !playerChoice;
        return playerChoice;
    }

    public void mover(int x, int y) {
        if (".".equals(matriz[x][y])) {
            matriz[x][y] = playerChoice ? "X" : "0";
        } else {
            System.out.println("No es válido el movimiento");
        }
        eleccion();
        ganar();
    }

    public void ganar() {
        if (matriz[0][0] == "X" && matriz[0][1] == "X" && matriz[0][2] == "X") {
            winX = true;
            countX += 1;
        }
        if (matriz[0][0] == "X" && matriz[0][1] == "X" && matriz[0][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[1][0] == "X" && matriz[1][1] == "X" && matriz[1][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[2][0] == "X" && matriz[2][1] == "X" && matriz[2][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][0] == "X" && matriz[1][0] == "X" && matriz[2][0] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][2] == "X" && matriz[1][2] == "X" && matriz[2][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][1] == "X" && matriz[1][1] == "X" && matriz[2][1] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][0] == "X" && matriz[1][1] == "X" && matriz[2][2] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][2] == "X" && matriz[1][1] == "X" && matriz[2][0] == "X") {
            winX = true;
            countX += 1;

        }
        if (matriz[0][0] == "0" && matriz[0][1] == "0" && matriz[0][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[1][0] == "0" && matriz[1][1] == "0" && matriz[1][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[2][0] == "0" && matriz[2][1] == "0" && matriz[2][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][0] == "0" && matriz[1][0] == "0" && matriz[2][0] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][2] == "0" && matriz[1][2] == "0" && matriz[2][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][1] == "0" && matriz[1][1] == "0" && matriz[2][1] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][0] == "0" && matriz[1][1] == "0" && matriz[2][2] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (matriz[0][2] == "0" && matriz[1][1] == "0" && matriz[2][0] == "0") {
            win0 = true;
            count0 += 1;

        }
        if (vacios() == 0 && winX == false && win0 == false) {
            empate = true;
        }
        verificarAttack();
        System.out.printf("La vida actual es:\n X = %d \t 0 = %d\n",vidaX,vida0);
    }

    public void verificarAttack() {
        if (winX == true) {
            System.out.println("El jugador X ataca");
            vida0 -= 10;
            juegoNuevo();
        } else if (win0== true) {
            System.out.println("El jugador 0 ataca");
            vidaX -= 10;
            juegoNuevo();
        } else if (empate == true) {
            System.out.println("Ningun jugador ataca");
            juegoNuevo();
        }
    }

    public int vacios() {
        int vacios = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == ".") {
                    vacios++;
                }
            }
        }
        return vacios;
    }

    public boolean gameEnd() {
        boolean gameEnd = true;
        if (vidaX == 0 || vida0 == 0) {
            gameEnd = false;
        }
        return gameEnd;
    }

    public void leerMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }

}
