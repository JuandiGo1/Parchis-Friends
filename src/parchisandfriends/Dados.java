/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parchisandfriends;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JToggleButton;

/**
 *
 * @author Usuario
 */
public class Dados extends Thread {

    int time;
    int d1, d2;
    JToggleButton boton1, boton2;
    ArrayList<Icon> dados = Tablero.dados;

    public Dados(JToggleButton boton1, JToggleButton boton2) {
        this.boton1 = boton1;
        this.boton2 = boton2;
        time = 70;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    
    @Override
    public void run() {
        for (int i = 1; i <= 8; i++) {
            this.d1 = (int) (Math.random() * 6) + 1;
            this.d2 = (int) (Math.random() * 6) + 1;
            
            boton1.setIcon(dados.get(d1-1));
            boton2.setIcon(dados.get(d2-1));
            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        Tablero.numero1=d1;
        System.out.println(d1);
        System.out.println(d2);
        
        
    }

    
    

}
