/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parchisandfriends;

/**
 *
 * @author ASUS TUF GAMING F15
 */
public class NodoPadre {
    int numero;
    int centroX;
    int centroY;
    boolean seguro, salida, entrada;
    int color; //0 si no tiene, 1 para rojo, 2 para azul, 3 para amarillo, 4 para verde
    int cantFichas;
    String dondeSumar;
    NodoPadre next;
    NodoPadre prev;

    public NodoPadre(int numero, int centroX, int centroY, boolean seguro, int color, boolean salida, boolean entrada, String donde) {
        this.numero = numero;
        this.centroX = centroX;
        this.centroY = centroY;
        this.seguro = seguro;
        this.color = color;
        this.next = null;
        this.prev = null;
        this.salida=salida;
        this.entrada=entrada;
        this.dondeSumar=donde;
    }
    
    

    
}

