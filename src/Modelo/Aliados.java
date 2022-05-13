
package Modelo;

import Factory.NPC;
import java.util.Random;


public class Aliados implements NPC{
    private int x;
    private int y;
    private boolean eliminado;
    
    Random rn = new Random();
    public Aliados(){
        this.x = 100+rn.nextInt(700);
        this.y = 100+rn.nextInt(700);
        this.eliminado = false;
    }


    @Override
    public String Tipo() {
        return "Aliados";
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int gety() {
        return this.y;
    }

    @Override
    public boolean isEliminado() {
        return eliminado;
    }

    @Override
    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
      
}
