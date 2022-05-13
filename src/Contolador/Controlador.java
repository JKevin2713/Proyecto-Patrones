
package Contolador;

import Factory.Factory;
import Factory.NPC;
import Modelo.Personaje;
import Modelo.Enemigo;
import Observer.Observable;
import Observer.Observer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Controlador extends JPanel implements ActionListener, Observable, Observer{
    
    Personaje personaje = new Personaje();
    Timer timer = new Timer(5,this);
    boolean bandera = false;
    ArrayList<Observer> enemigos;
    
    public Controlador()
    {
        setBackground(Color.GREEN);
        addKeyListener(new teclado());
        setFocusable(true);
        enemigos = new ArrayList<Observer>();
        timer.start();
    }
    NPC enemigo1 = Factory.Fabricar("Enemigo");
    NPC enemigo2 = Factory.Fabricar("Enemigo");
    NPC enemigo3 = Factory.Fabricar("Enemigo");
    NPC enemigo4 = Factory.Fabricar("Enemigo");
    NPC enemigo5 = Factory.Fabricar("Enemigo");
    
    NPC aliado1 = Factory.Fabricar("Aliados");
    //NPC aliado2 = Factory.Fabricar("Aliados");
    //NPC aliado3 = Factory.Fabricar("Aliados");
    //NPC aliado4 = Factory.Fabricar("Aliados");
    //NPC aliado5 = Factory.Fabricar("Aliados");
    
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        Toolkit t = Toolkit.getDefaultToolkit();
        Image enemigo = t.getImage("src/Imagenes/Enemigo.png");
        Image aliado = t.getImage("src/Imagenes/Aliado.png");
        Image vida = t.getImage("src/Imagenes/Puntos de vida.png");
        g2.drawImage(personaje.getImagen(), personaje.getX(), personaje.getY(),30, 30, null);
        switch (personaje.getVida()) {
            case 10:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                g2.drawImage(vida, 840, 0, 20, 20, this);
                g2.drawImage(vida, 820, 0, 20, 20, this);
                g2.drawImage(vida, 800, 0, 20, 20, this);
                g2.drawImage(vida, 780, 0, 20, 20, this);
                break;
            case 9:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                g2.drawImage(vida, 840, 0, 20, 20, this);
                g2.drawImage(vida, 820, 0, 20, 20, this);
                g2.drawImage(vida, 800, 0, 20, 20, this);
                break;
            case 8:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                g2.drawImage(vida, 840, 0, 20, 20, this);
                g2.drawImage(vida, 820, 0, 20, 20, this);
                break;
            case 7:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                g2.drawImage(vida, 840, 0, 20, 20, this);
                break;
            case 6:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                g2.drawImage(vida, 860, 0, 20, 20, this);
                break;
            case 5:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                g2.drawImage(vida, 880, 0, 20, 20, this);
                break;
            case 4:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                g2.drawImage(vida, 900, 0, 20, 20, this);
                break;
            case 3:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                g2.drawImage(vida, 920, 0, 20, 20, this);
                break;
            case 2:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                g2.drawImage(vida, 940, 0, 20, 20, this);
                break;
            case 1:
                g2.drawImage(vida, 960, 0, 20, 20, this);
                break;
            default:
                break;
        }
        
        g2.drawImage(enemigo, enemigo1.getX(),enemigo1.gety(), 20, 20, this);
        g2.drawImage(enemigo, enemigo2.getX(),enemigo2.gety(), 20, 20, this);
        g2.drawImage(enemigo, enemigo3.getX(),enemigo3.gety(), 20, 20, this);
        g2.drawImage(enemigo, enemigo4.getX(),enemigo4.gety(), 20, 20, this);
        g2.drawImage(enemigo, enemigo5.getX(),enemigo5.gety(), 20, 20, this);
        
        
//       System.out.println("Enemigo x: "+enemigo1.getX()+" Enemigo y: "+enemigo1.gety());
        System.out.println("Aliado x: "+aliado1.getX()+" Aliado y: "+aliado1.gety());
        System.out.println("Personaje x: "+personaje.getX()+" Personaje y: "+personaje.getY());
        
        if(personaje.getX() < aliado1.getX()-60 || personaje.getX() > aliado1.getX()+60 || personaje.getY() < aliado1.gety()-60 || personaje.getY() > aliado1.gety()+60)
        {
            
        }else{
            g2.drawImage(aliado, aliado1.getX(),aliado1.gety(),40,40,this);   
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //System.out.println("Aja");
        personaje.Moverse();
        repaint();
    }
    
    public void enlazarObservadores(Observer o){
        enemigos.add(o);
    }
    
    @Override
    public void noticar() {
        
    }

    @Override
    public void update() {
    }
    
    private class teclado extends KeyAdapter
    {
        
        @Override
        public void keyPressed(KeyEvent e)
        {
            personaje.keyPressed(e);
        }
        
        @Override
        public void keyReleased(KeyEvent e)
        {
            personaje.keyReleased(e);
        }
    }
}
