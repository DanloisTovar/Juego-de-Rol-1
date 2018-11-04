
package juegoderol;

import java.util.Random;


public class Personajes {

    public Personajes() {
    }
    
    
    private String nombre;
    private int vida, minPower, maxPower;
    
    private Random random = new Random (System.nanoTime());
    
    
    
    
    public int getVida () {        
        return this.vida;
    }
    
    public void setVida ( int nuevaVida) {        
        this.vida = nuevaVida;
    }
    
    
    
    public String getNombre () {        
        return this.nombre;    
    }
    
    public void setNombre (String nuevoNombre){        
        this.nombre = nuevoNombre;
    }
    
    

    public int getMinPower() {
        return minPower;
    }

    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }
    
    

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }
    
    
    public int GolpeBasico () { 
        
        int golpeAleatorio = random.nextInt(maxPower);
        
        return golpeAleatorio;
    
    }
    
    public int golpeIntermedio () {
        
        return vida- GolpeBasico() - 4;
    }
    
    public int GolpeFuerte () {
        
        return vida-GolpeBasico() - 7;
    
    }   
    
    public void daño (int vida) {
        
        this.vida -= vida;
    
    }
    
    
    
}
