package parchisandfriends;

import java.util.ArrayList;

/**
 *
 * @author ASUS TUF GAMING F15
 */
public class Jugador {

    String nick;
    private ArrayList<ficha> fichas;

    public Jugador(String nick, ArrayList<ficha> fichas) {
        this.nick = nick;
        this.fichas = fichas;
    }
}
