/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parchisandfriends;

/**
 *
 * @author ASUS TUF GAMING F15
 */
public class ListaTablero {
    NodoPadre head= null;
    NodoPadre tail= null;
    
    public void add(NodoPadre nodo){
        NodoPadre P= nodo;
        if(head== null){
            head=P;
            tail=P;
            
        }else{
            tail.next =P;
            P.prev = tail;
        }
        
        head.prev = tail;
        tail.next = head;
    }
    
    
}
