
package Modelo;

import Factory.Factory;
import Factory.NPC;
import Contolador.Controlador;
import Vista.Mundo;



public class Proyecto2 {


    public static void main(String[] args) {
        
        //System.out.println("Comienza el proyecto");
        Mundo vista = new Mundo();
        Controlador controller = new Controlador();
        
        
        
        vista.add(controller);
        vista.setVisible(true);
        
        
        
        
        NPC npcs = Factory.Fabricar("Enemigo");
        npcs.Tipo();
        
    }
    
}
