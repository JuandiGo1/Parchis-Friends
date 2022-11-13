/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parchisandfriends;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author ASUS TUF GAMING F15
 */
class ficha extends JButton  {

    private Jugador owner;
    private int color; //1 para rojo, 2 para azul, 3 para amarillo, 4 para verde
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

    public int getColor() {
        return color;
    }

    public void setPos(int posx, int posy, boolean salir, String donde, boolean sumRes) {
        this.posx = posx;
        this.posy = posy;
        if (donde.equals("y")) {
            if (sumRes) {
                this.posx = posx;
                this.posy = posy + 20;
            } else {
                this.posx = posx;
                this.posy = posy - 20;
            }

        }
        if (donde.equals("x")) {
            if (sumRes) {
                this.posx = posx + 20;
                this.posy = posy;
            } else {
                this.posx = posx - 20;
                this.posy = posy;
            }
        }
        if (salir) {
            this.setBounds(this.posx, this.posy, 40, 40);
        }
    }

    public void encarcelar() {
        this.enCasa = true;
        this.casilla = 0;
    }

    public void acomodar(String color) {
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + color + ".png")));
        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setVisible(true);
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("detectada");
            }
        });
    }


}
