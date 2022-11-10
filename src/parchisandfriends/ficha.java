/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parchisandfriends;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author ASUS TUF GAMING F15
 */
class ficha {

    private Jugador owner;
    private int color; //1 para rojo, 2 para azul, 3 para amarillo, 4 para verde
    JButton ficha;
    int numero;
    int casilla;
    int posx, posy;
    boolean disponible = false;
    boolean enCasa = true;

    public ficha(Jugador owner, int color, int numero, int posx, int posy) {
        this.owner = owner;
        this.color = color;
        this.numero = numero;
        this.posx = posx;
        this.posy = posy;

    }

    public Jugador getOwner() {
        return owner;
    }

    public void setBoton(JButton ficha) {
        this.ficha = ficha;
    }

    public JButton getBoton() {
        return this.ficha;
    }

    public int getColor() {
        return color;
    }

    public void setPos(int posx, int posy, boolean salir, String donde, boolean sumRes) {
        this.posx = posx;
        this.posy = posy;
        if (donde.equals("y")) {
            if (sumRes) {
                this.posx = posx;
                this.posy = posy+20;
            }else{
                this.posx = posx;
                this.posy = posy-20;
            }

        }
        if (donde.equals("x")) {
            if (sumRes) {
                this.posx = posx+20;
                this.posy = posy;
            }else{
                this.posx = posx-20;
                this.posy = posy;
            }
        }
        if (salir) {
            this.getBoton().setBounds(posx, posy, 40, 40);
        }
    }

    public void encarcelar() {
        this.enCasa = true;
        this.casilla = 0;
    }

}
