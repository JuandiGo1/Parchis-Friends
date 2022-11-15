package parchisandfriends;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ASUS TUF GAMING F15
 */
public class Jugador {

    String nick;
    ArrayList<ficha> fichas = new ArrayList<>();
    int turno;
    NodoPadre casillaSalida;
    boolean pasar = false;

    public Jugador(String nick, int turn) {
        this.nick = nick;
//        this.fichas = fichas;
        this.turno = turn;

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

                                f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, false, false);
                                agregar.add(f);

                                tam++;

                            }
                        }

                    }
                    System.out.println("tam antes : " + casillaSalida.cantFichas.size());
                    if(remover.size()>0){
                        casillaSalida.cantFichas.removeAll(remover);
                    }
                    if(agregar.size()>0){
                        casillaSalida.cantFichas.addAll(agregar);
                    }

                    
                    System.out.println("tam despues de agregar: " + casillaSalida.cantFichas.size());
                } else {
                    System.out.println("vacia");
                    f.enCasa = false;
                    f.casilla = casillaSalida.numero;
                    f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, true, false);
                    System.out.println("saca ficha");
                    casillaSalida.cantFichas.add(f);
                    tam++;

                }
            }
        }
    }

}
