/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parchisandfriends;

import static parchisandfriends.Tablero.BuscarPorNum;

/**
 *
 * @author ASUS TUF GAMING F15
 */
public class HiloFicha extends Thread{
    ficha ficha;
    int valor;

    public HiloFicha(ficha ficha, int valor) {
        this.ficha = ficha;
        this.valor = valor;
    }
    
    
    
    @Override
    public void run(){
        int posActual = ficha.casilla;
        NodoPadre casillaInicio = BuscarPorNum(posActual); 
        int destino = posActual + valor;
        
//        if(casillaInicio.entrada=true && casillaInicio.color== ficha.getColor()){
//            destino= (posActual*10) + valor;
//        }

        if(ficha.getColor()!=1 && destino>68){
            destino= destino-68;
        }
        NodoPadre casillaFin = BuscarPorNum(destino);
        
        for(int i= posActual; i<=destino;i++){
            NodoPadre temp= BuscarPorNum(i);
            //ficha.setPos(i, i, true, donde, true);
        }
        
    }
}