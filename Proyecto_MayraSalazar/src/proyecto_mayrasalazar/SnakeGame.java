package proyecto_mayrasalazar;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// la clase snake deriva de JFrame de manera en la que sea una Frame pero
// con las caracteristicas que deseemos, por ejemplo:
// que reconozca imputs del teclado y que reconozca threads
class SnakeGame extends JFrame implements KeyListener, Runnable {

    JPanel p1, p2; 
    JButton[] lb = new JButton[200];
    JButton bonusfood; // De vez en cuando salen cuadritos que mas grandes que salen con random, los puntitos son botones
    JTextArea t; // para poner texto
    int x = 500, y = 250, gu = 2, directionx = 1, directiony = 0, speed = 50, difference = 0, oldx, oldy, score = 0;
    int[] lbx = new int[300]; //arrays de las coordenadas x donde aparecera comida
    int[] lby = new int[300]; //arrays de las coordenadas y donde aparecera comida
    Point[] lbp = new Point[300]; 
    Point bfp = new Point();
    Thread myt; // el thread
    boolean food = false, runl = false, runr = true, runu = true, rund = true, bonusflag = true;
    Random r = new Random();
    JMenuBar mymbar; // la barra de menu que necesita para ponderle nuevo juego, salir y su info
    JMenu game, help; // las opciones que salen en el menu

    public void initializeValues() {
        gu = 5; // esto es importante, este es la cantidad de cuadritos que se mueven del gusanito inicialmente
        //en la funcion de createSnake hay un for y el for define el tamaño del gusanito
        // si gu =3 y en el for hay i < 5 el gusanito solo movera 3 cuadritos y dejara 2 atras  
        // asi que gu y la condicion del for deben ser iguales
        lbx[0] = 100;
        lby[0] = 150;
        directionx = 10; //direccion en la que va el gusanito, cambiela a negativo y va a la izquierda
        directiony = 0; //como es su movimiento inicial y debe ser 0 porque no se mueve horizontal
        difference = 0;
        score = 0;
        food = false;
        runl = true;// run left
        runr = true;// run right
        runu = true;//run up
        rund = true;//run down
        //se super necesitan esos booleanos porque si el gusanito esta corriendo a la derecha y yo presiono
        //izquierda eso no se debe poder, lo mismo de arriba hacia abajo
        //bueno en resumen es para que no vayan a la direccion contraria 
        bonusflag = true;//es para cuando sale comida bonus, se ocupa mas adelante porque la comida 
        //bonus da mas puntos
        
    }

    public SnakeGame() {
        super("Snake");
        setSize(500, 330); //este es el size de la ventana
        //llamamos la funcion createbar que tiene las instancias para crear el menu del Form
        creatbar();
        //initializar variables
        initializeValues();
        // las 2 partes del UI
        p1 = new JPanel();
        p2 = new JPanel();
        // t es nuestra variable de texto)
        t = new JTextArea("Score ==>" + score);
        t.setEnabled(false);// necesita que esto sea false o el usuario puede cambiar el texto.
        t.setBackground(Color.BLACK);
        // esta es la comida
        bonusfood = new JButton();
        bonusfood.setEnabled(false);//son botones disabled tambien
        // y aqui se inicia el gusanito
        createFirstSnake();

        p1.setLayout(null);
        p2.setLayout(new GridLayout(0, 1));
        p1.setBounds(0, 0, x, y); //estos son los limites del cuadrito donde viaja el gusanito
        p1.setBackground(Color.black);
        p2.setBounds(0, y, x, 30); // este cubre menos espacio,p2 es el espacio del score
        p2.setBackground(Color.BLACK);

        p2.add(t); // Se añade texto a un panel

        getContentPane().setLayout(null);
        getContentPane().add(p1);
        getContentPane().add(p2);
        // y estas funciones añaden nuestros 2 paneles a la ventana

        show();
        setDefaultCloseOperation(EXIT_ON_CLOSE);// esta función se necesita para que cierre la ventana con X

        addKeyListener(this); // inicia la funcion que esucha (se le dice asi cuando espera) un input del teclado
        // start thread
        myt = new Thread(this);
        myt.start(); // se inicia el thread que llama la funcion run la cual es un ciclo infinito
        //podria decirse que es el ciclo del juego, el cual dibuja constantemente los elementos en la pantalla
    }

    public void createFirstSnake() {
        /* nuestra funcion de crear gusanito es un for donde la condicion del for debe ser
        igual a la variable gu. Se dice que todos los elementos del array
        del guisanito indican como avanza, si se fija solo se le resta a x para que avance en X*/
        for (int i = 0; i < gu; i++) {
            lb[i] = new JButton("lb" + i);
            lb[i].setEnabled(false);
            p1.add(lb[i]);
            lb[i].setBounds(lbx[i], lby[i], 10, 10);
            lbx[i + 1] = lbx[i] - 10;
            lby[i + 1] = lby[i];
        }
    }

    public void creatbar() {
        //Esta es la función que se llama al principio que contiene las instancias que crean el menu
        mymbar = new JMenuBar(); // Se instancia la barra de menú.

        game = new JMenu("Game"); // Se instancia la opción game, el argumento es el texto que tendra la opción.

        JMenuItem newgame = new JMenuItem("New Game");
        JMenuItem exit = new JMenuItem("Exit"); // Como lo dice ahi son items del menú.

        // Todo JmenuItem tiene la función action listener y esa es la estructura para resetar el juego.
        newgame.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        reset();
                    }
                });
        //y esta es la estructura para cerrar la ventana por medio de un actionListener.
        exit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //ahora a game que es nuestra tab del menu le tenemos que añadir nuestros 2 items pero entre ellos eñ separador
        game.add(newgame);
        game.addSeparator();
        game.add(exit);

        mymbar.add(game);
        // YYYY creamos otra opcion para el menu
        help = new JMenu("Help");
        //otro item
        JMenuItem creator = new JMenuItem("Creator");
        //pero este item al darle clic muestra un dialog
        // y esta es la estructira para mostrar un dialog sencillo
        creator.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(p2, "Name :Mayra Salazar");
            }
        });
        //repetimos lo mismo que hicimos con la primera pestaña
        help.add(creator);
        mymbar.add(help);
        
        //al final armamos el menú
        setJMenuBar(mymbar);
    }

    void reset() {
        //la funcion que le da los valores default
        initializeValues();
        //aqui al gusanito lo hacemos pequeno otra vez
        p1.removeAll();
        //esto seria para detener el thread
        myt.stop();
        
        //crear nuevamente un gusanito
        createFirstSnake();
        //yyyy poner otra vez el score en 0
        t.setText("Score==>" + score);

        //creamos un nuevo thread y dale start otra vez para que active el metodo run
        myt = new Thread(this);
        myt.start();
    }

    void growup() {
        /*lb es el arreglo de botones que conforman al guisanito
        para hacerlo crecer le ponemos gu que es es el tamaño actual del gusanito como posición
        del arreglo y le creamos un nuevo boton y de paso lo deshabilitamos*/
        lb[gu] = new JButton();
        lb[gu].setEnabled(false);
        //y por ultimo se lo ponemos
        p1.add(lb[gu]);
        
        //r es nuestra variable de random
        //a y b seran las coordenadas donde aparecera la comidita nueva despues de ser comida
        int a = 10 + (10 * r.nextInt(48));
        int b = 10 + (10 * r.nextInt(23));
        
        //al añadirlo en el array del lbx y lby ya tenemos ese valor numerico para esa cordenada
        lbx[gu] = a;
        lby[gu] = b;
        lb[gu].setBounds(a, b, 10, 10);

        gu++;
    }

    //este metodo es la lógica de movimiento donde donde la direccion la define el imput de direccion
    //recuerde que definimos que el gusanito inicialmente se mueva a la derecha 

    void moveForward() {
        for (int i = 0; i < gu; i++) {
            lbp[i] = lb[i].getLocation();
        }
        //Básicamente se establecen los límites de movimiento en base a las variables
        //que inicializamos al principio
        lbx[0] += directionx;
        lby[0] += directiony;
        lb[0].setBounds(lbx[0], lby[0], 10, 10);

        for (int i = 1; i < gu; i++) {
            lb[i].setLocation(lbp[i - 1]);
        }
        // XD esta es ya logica de movimiento de gusanito que vi en un tutorial
     
        //pero creo que quiere decir como se debe mover el gusanito cuando no se presionan teclas
        //si no se presiona nada se mueve positivamente en x
        //
        if (lbx[0] == x) {
            lbx[0] = 10;
        } else if (lbx[0] == 0) {
            lbx[0] = x - 10;
        } else if (lby[0] == y) {
            lby[0] = 10;
        } else if (lby[0] == 0) {
            lby[0] = y - 10;
        }
        //obviamente en la funcion de moviemiento verifica si el gusanito osea gu ha hecho contacto
        //con comida que esta en la coordenada lbx y lby
        // de ser asi le suma 5 puntos al score yyyyy el gusanito debe crecer
        //para que crezca food debe ser falso y mas adelante se llama la funcion growup
        if (lbx[0] == lbx[gu - 1] && lby[0] == lby[gu - 1]) {
            food = false;
            score += 5;
            t.setText("Score==>" + score);
            if (score % 50 == 0 && bonusflag == true) {
                p1.add(bonusfood);
                bonusfood.setBounds((10 * r.nextInt(50)), (10 * r.nextInt(25)), 15, 15);
                bfp = bonusfood.getLocation();
                bonusflag = false;
            }
        }
        
        if (bonusflag == false) {
            if (bfp.x <= lbx[0] && bfp.y <= lby[0] && bfp.x + 10 >= lbx[0] && bfp.y + 10 >= lby[0]) {
                p1.remove(bonusfood);
                score += 100;
                t.setText("Score ==>" + score);
                bonusflag = true;
            }
        }

        if (food == false) {
            growup();
            food = true;
            if(score == 200){
                t.setText("YOU WIN!!!	" + score);
                try {
                    myt.join();
                } catch (InterruptedException ie) {
                }
            }
        } else {
            lb[gu - 1].setBounds(lbx[gu - 1], lby[gu - 1], 10, 10);
        }

        for (int i = 1; i < gu; i++) {
            if (lbp[0].x == 0 || lbp[0].x == 470 || lbp[0].y == 240 || lbp[0].y == 0) {
                t.setText("GAME OVER	" + score);
                try {
                    myt.join();
                } catch (InterruptedException ie) {
                }
                break;
            }
        }


        p1.repaint();
        show();
    }

    public void keyPressed(KeyEvent e) {
        // snake move to left when player pressed left arrow
        if (runl == true && e.getKeyCode() == 37) {
            directionx = -10; // means snake move right to left by 10pixels
            directiony = 0;
            runr = false;     // run right(runr) means snake cant move from left to right
            runu = true;      // run up   (runu) means snake can move from down to up
            rund = true;      // run down (run down) means snake can move from up to down
        }
        // snake move to up when player pressed up arrow
        if (runu == true && e.getKeyCode() == 38) {
            directionx = 0;
            directiony = -10; // means snake move from down to up by 10 pixel
            rund = false;     // run down (run down) means snake can move from up to down
            runr = true;      // run right(runr) means snake can move from left to right
            runl = true;      // run left (runl) means snake can move from right to left
        }
        // snake move to right when player pressed right arrow
        if (runr == true && e.getKeyCode() == 39) {
            directionx = +10; // means snake move from left to right by 10 pixel
            directiony = 0;
            runl = false;
            runu = true;
            rund = true;
        }
        // snake move to down when player pressed down arrow
        if (rund == true && e.getKeyCode() == 40) {
            directionx = 0;
            directiony = +10; // means snake move from left to right by 10 pixel
            runu = false;
            runr = true;
            runl = true;
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void run() {
        for (;;) {
            moveForward();
            try {
                Thread.sleep(speed);
            } catch (InterruptedException ie) {
            }
        }
    }
}
