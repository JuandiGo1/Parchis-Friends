package parchisandfriends;

import java.util.ArrayList;

/**
 *
 * @author ASUS TUF GAMING F15
 */
public class Jugador {

    String nick;
    private ArrayList<ficha> fichas;
    int turno;

    public Jugador(String nick, ArrayList<ficha> fichas, int turn) {
        this.nick = nick;
        this.fichas = fichas;
        this.turno = turn;
    }
}
