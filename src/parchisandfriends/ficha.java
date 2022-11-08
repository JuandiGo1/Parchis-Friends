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
    private Color color;
    JButton ficha;
    int numero;
    int casilla;
    int posx, posy;
    boolean disponible = false;

    public ficha(Jugador owner, Color color, int numero, int posx, int posy, int casilla, JButton ficha) {
        this.owner = owner;
        this.color = color;
        this.numero = numero;
        this.posx = posx;
        this.posy = posy;
        this.casilla = casilla;
        this.ficha=ficha;
    }

    public Jugador getOwner() {
        return owner;
    }

    public void setOwner(Jugador owner) {
        this.owner = owner;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPos(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }

}
