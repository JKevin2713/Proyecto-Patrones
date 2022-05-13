
package Modelo;

import Factory.NPC;
import java.util.Random;


public class Enemigo implements NPC{
    
    private int x;
    private int y;
    private boolean eliminado;
    Random rn = new Random();
    
    //Constructor
    public Enemigo() {
        this.x = 100+rn.nextInt(700);
        this.y = 100+rn.nextInt(700);
        this.eliminado = false;
    }
    
    @Override
    public String Tipo() {
        return "Enemigo";
    }

    @Override
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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
