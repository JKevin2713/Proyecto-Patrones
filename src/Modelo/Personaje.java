
package Modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Personaje{
    
    //Atributos
    private String personaje;
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int vida;
    private Image imagen;
    
    //Constructor
    public Personaje()
    {
        this.x = 30;
        this.y = 30;
        this.vida = 10;
        this.personaje = "src/Imagenes/PersonajeDerecha.png";
        ImageIcon img = new ImageIcon(this.personaje);
        imagen = img.getImage();
    }
    
    //Metodos
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        switch (key) {
            case KeyEvent.VK_UP:
                dy = dy -1;
                break;
            case KeyEvent.VK_LEFT:
                dx = dx -1;
                this.personaje = "src/Imagenes/PersonajeIzquierda.png";
                ActualizarImagen();
                break;
            case KeyEvent.VK_RIGHT:
                dx = 1;
                this.personaje = "src/Imagenes/PersonajeDerecha.png";
                ActualizarImagen();
                break;
            case KeyEvent.VK_DOWN:
                dy = 1;
                break; 
            default:
                break;
        }
    }
    
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        switch (key) {
            case KeyEvent.VK_UP:
                dy = 0;
                break;
            case KeyEvent.VK_LEFT:
                dx = 0;
                break;
            case KeyEvent.VK_RIGHT:
                dx = 0;
                break;
            case KeyEvent.VK_DOWN:
                dy = 0; 
                break;
            default:
                break;
        }
    }
    
    private void ActualizarImagen()
    {
        ImageIcon img = new ImageIcon(this.personaje);
        imagen = img.getImage();
    }
    
    public void Moverse()
    {
        if(this.x > 0)
        {
            x += dx;
        }else{
            this.x = 1;
        }
        
        if(this.x < 950)
        {
            x += dx;
        }else{
            this.x = 949;
        }
        
        if(this.getY() > 0)
        {
            y += dy;
        }else{
            this.y = 1;
        }
        
        if(this.y < 730){
            y += dy;
        }else{
            this.y = 729;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImagen() {
        return imagen;
    }    

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
