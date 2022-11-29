/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parchisandfriends;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static parchisandfriends.Tablero.botonesDados;
import static parchisandfriends.Tablero.dado1Select;
import static parchisandfriends.Tablero.dado2Select;
import static parchisandfriends.Tablero.turno;
import static parchisandfriends.Tablero.valorDados;

/**
 *
 * @author ASUS TUF GAMING F15
 */
class ficha extends JButton {

    private Jugador owner;
    private int color; //1 para rojo, 2 para azul, 3 para amarillo, 4 para verde
    int numero;
    int casilla;
    int posx, posy, inicialx, inicialy;
    int disponible = 0; //0 en casa, 1 jugando, 2 ganó
    boolean enCasa = true;
    boolean enPasillo=false;
    boolean dioVuelta=false;
    ficha esta;

    public ficha(Jugador owner, int color, int numero, int posx, int posy) {
        this.owner = owner;
        this.color = color;
        this.numero = numero;
        this.posx = posx;
        this.posy = posy;
        this.esta = this;

    }

    public Jugador getOwner() {
        return owner;
    }

    public int getColor() {
        return color;
    }

    public void setPos(int posx, int posy, boolean salir, String donde, boolean sumRes, boolean dePaso) {
        this.posx = posx;
        this.posy = posy;
        if (dePaso) {
            this.setBounds(this.posx, this.posy, 40, 40);
            return;
        }
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

    public void coorInicial(int x, int y) {
        this.inicialx = x;
        this.inicialy = y;
    }

    public void encarcelar() {
        this.enCasa = true;
        this.casilla = 0;
        this.setPos(this.inicialx, this.inicialy, true, "", true, true);
        System.out.println("MATO");
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
                if (turno == esta.owner.turno) {
                    if (!esta.enCasa && esta.disponible!=0) {

                        System.out.println("detectada");
                        if (valorDados > 0) {
                            HiloFicha movimiento = new HiloFicha(esta, valorDados);
                            

                            movimiento.start();
                        }
                    } else {
                        Tablero.info.setText("No puedes mover esa ficha!");
                    }
                } else {
                    System.out.println("No es tu ficha");
                }

            }
        });
    }

}
