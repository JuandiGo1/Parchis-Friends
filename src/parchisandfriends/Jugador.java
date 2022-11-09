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

    public Jugador(String nick, int turn) {
        this.nick = nick;
//        this.fichas = fichas;
        this.turno = turn;
        
    }

}
