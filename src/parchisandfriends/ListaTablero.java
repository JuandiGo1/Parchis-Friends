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
    static NodoPadre head= null;
    static NodoPadre tail= null;
    
    
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
    
    public  NodoPadre BuscarPorNumero(int num){
        NodoPadre P= head;
        NodoPadre Q= null;
        if(head==null){
            System.out.println("Lista Vacia");
            return null;
        }
        do{
            if(P.numero==num){
                Q=P;
                System.out.println(Q.numero);
                return Q;
            }
            P=P.next;
            
        }while(P!=head);
        return Q;
    }
    
    
}
