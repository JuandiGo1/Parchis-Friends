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
        ArrayList<ficha> agregar = new ArrayList<>();
        ArrayList<ficha> remover = new ArrayList<>();
        int tam = casillaSalida.cantFichas.size();
        for (ficha f : fichas) {
            if (f.enCasa) {
                if (!casillaSalida.cantFichas.isEmpty()) {
                    for (ficha k : casillaSalida.cantFichas) {
                        if (k.getColor() != f.getColor()) {
                            k.encarcelar();
                            remover.add(k);
                            tam--;

                        } else {
                            System.out.println("entra");
                            System.out.println(tam);
                            if (tam == 1) {
                                System.out.println("prueba 1 si");
                                
                                f.casilla = casillaSalida.numero;
                                f.enCasa=false;
//                                switch (tam) {
//                                    case 0:
//                                        f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, true);
//                                        break;
//                                    case 1:
//                                        
//                                        break;
//                                }
                                f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, false);
                                agregar.add(f);
                                
                                tam++;

                            }
                        }

                    }
                    casillaSalida.cantFichas.removeAll(remover);
                    casillaSalida.cantFichas.addAll(agregar);
                } else {
                    f.enCasa=false;
                    f.casilla = casillaSalida.numero;
                    f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, true);
                    System.out.println("saca ficha");
                    casillaSalida.cantFichas.add(f);
                    tam++;

                }
            }
        }
    }

}
