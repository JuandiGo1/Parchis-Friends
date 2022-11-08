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
    boolean seguro;
    int color; //0 si no tiene, 1 para rojo, 2 para azul, 3 para amarillo, 4 para verde
    NodoPadre next;
    NodoPadre prev;

    public NodoPadre(int numero, int centroX, int centroY, boolean seguro, int color) {
        this.numero = numero;
        this.centroX = centroX;
        this.centroY = centroY;
        this.seguro = seguro;
        this.color = color;
        this.next = null;
        this.prev = null;
    }
    
    
    public class NodoSimple extends NodoPadre{ 

        public NodoSimple(int numero, int centroX, int centroY, boolean seguro, int color) {
            super(numero, centroX, centroY, seguro, color);
            
        }
        
    }
    
     public class NodoPro extends NodoPadre{ 
         NodoSimple entrada;

        public NodoPro(int numero, int centroX, int centroY, boolean seguro, int color) {
            super(numero, centroX, centroY, seguro, color);
        }
         
        
    }
    
}

