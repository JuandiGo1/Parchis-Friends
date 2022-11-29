package parchisandfriends;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import static parchisandfriends.Tablero.Jugadores;
import static parchisandfriends.Tablero.llegada;


/**
 *
 * @author ASUS TUF GAMING F15
 */
public class Jugador {

    String nick;
    ArrayList<ficha> fichas = new ArrayList<>();
    int turno;
    NodoPadre casillaSalida;
    int color;
    boolean pasar = false;
    int enSeco=0;
    boolean saca;
    JPanel Panel;
    Tablero padre;
    JToggleButton dado1, dado2;

    public Jugador(Tablero padre, String nick, int turn, int color) {
        this.padre = padre;
        this.nick = nick;
        this.turno = turn;
        this.color=color;
        

    }
    
    public void asignarBotones(JToggleButton b1, JToggleButton b2){
        this.dado1=b1;
        this.dado2=b2;
    }

    public boolean tieneFichasFuera() {
        for (ficha f : this.fichas) {
            if (!f.enCasa) {
                return true;
            }
        }
        return false;
    }
    
    public int FichasFuera() {
        int fuera=0;
        for (ficha f : this.fichas) {
            if (f.disponible==1) {
                fuera++;
            }
        }
        return fuera;
    }
    
    public boolean gana() {
        int cant=0;
        for (ficha f : this.fichas) {
            if (f.disponible==2) {
                cant++;
            }
        }
        if(cant==4){
            Jugadores.remove(this);
            llegada.add(this);
            this.Paneles(false);
            padre.reAsignarTurnos();
            return true;
        }
        
        return false;
    }
    
    public boolean tieneFichaEnPasillo(){
        for( ficha f: this.fichas){
            if(f.enPasillo)
                return true;
        }
        return false;
    }
    
    public void Paneles(boolean enabled){
        System.out.println(this.Panel);
        for (Component component : this.Panel.getComponents()) {
                    component.setEnabled(enabled);
                }
    }

    public void sacar() {

        int tam = casillaSalida.cantFichas.size();
        System.out.println("tam inicial : " + tam);
        for (ficha f : fichas) {
            ArrayList<ficha> agregar = new ArrayList<>();
            ArrayList<ficha> remover = new ArrayList<>();
            if (f.enCasa) {
                if (!casillaSalida.cantFichas.isEmpty()) {
                    System.out.println("no vacia");
                    for (ficha k : casillaSalida.cantFichas) {
                        if (k.getColor() != f.getColor()) {
                            k.encarcelar();
                            remover.add(k);
                            tam--;

                        } else {
                            System.out.println("entra");
                            System.out.println("tam: " + tam);
                            if (tam == 1) {
                                System.out.println("prueba 1 si");

                                f.casilla = casillaSalida.numero;
                                f.enCasa = false;
                                f.disponible=1;

                                f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, false, false);
                                agregar.add(f);

                                tam++;

                            }
                        }

                    }
                    System.out.println("tam antes : " + casillaSalida.cantFichas.size());
                    if (remover.size() > 0) {
                        casillaSalida.cantFichas.removeAll(remover);
                    }
                    if (agregar.size() > 0) {
                        casillaSalida.cantFichas.addAll(agregar);
                    }
                    saca=true;

                    System.out.println("tam despues de agregar: " + casillaSalida.cantFichas.size());
                } else {
                    System.out.println("vacia");
                    f.enCasa = false;
                    f.disponible=1;
                    f.casilla = casillaSalida.numero;
                    f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, true, false);
                    System.out.println("saca ficha");
                    casillaSalida.cantFichas.add(f);
                    saca=true;
                    tam++;

                }
            }
        }
    }

}
