package parchisandfriends;

import java.util.ArrayList;

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
        for (ficha f : fichas) {
            if (f.enCasa) {
                if (!casillaSalida.cantFichas.isEmpty()) {
                    for (ficha p : casillaSalida.cantFichas) {
                        if (p.getColor() != f.getColor()) {
                            p.encarcelar();
                            casillaSalida.cantFichas.remove(p);
                        } else {
                            if (casillaSalida.cantFichas.size() == 1) {
                                casillaSalida.cantFichas.add(f); //reemplazar la ficha invasora por la que sale
                                f.casilla = casillaSalida.numero;
                                switch (casillaSalida.cantFichas.indexOf(f)) {
                                    case 0:
                                        f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, true);
                                        break;
                                    case 1:
                                        f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, false);
                                        break;
                                }

                            }
                        }

                    }
                } else {
                    f.setPos(casillaSalida.centroX, casillaSalida.centroY, true, casillaSalida.dondeSumar, true);
                }
            }
        }
    }

}
