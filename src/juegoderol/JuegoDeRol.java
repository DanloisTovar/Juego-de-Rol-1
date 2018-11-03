
package juegoderol;

import java.util.Random;


public class JuegoDeRol {

   
    public static void main(String[] args) {
        
        boolean Pj1 = true, Pj2 = true;
        int ataqueAleatorio, ataque0;
        
        Personajes Kairos = new Personajes();
        Personajes Malaquian = new Personajes();
        Random rand = new Random(System.nanoTime());
        
       Kairos.setVida(100);
       Kairos.setMaxPower(9);
       Kairos.setNombre("Karios");
    
       
       Malaquian.setVida(100);
       Malaquian.setMaxPower(9);
       Malaquian.setNombre("Malaquian");
      
       
        System.out.println(Kairos.getNombre() + " Tiene una vida de :" + Kairos.getVida() + "\n");
         System.out.println(Malaquian.getNombre() + " Tiene una vida de :" + Malaquian.getVida() + "\n");
         
         do {
             
             ataqueAleatorio =rand.nextInt(2);
             
             
             if (ataqueAleatorio ==0) {
                 
                ataque0 = Kairos.GolpeBasico();
                 
                 if (ataqueAleatorio ==1) {
                     
                     ataque0 = Kairos.golpeIntermedio();                     
                 }               
                 
             }
             else {             
                   ataque0 = Kairos.GolpeFuerte();
             }
             
              System.out.println(Kairos.getNombre() + " realizo un ataque de :" + ataque0 + "\n");
              
              Malaquian.daño(ataque0);
              
              
              if (Malaquian.getVida() >0) {
                  
                  ataqueAleatorio =rand.nextInt(2);
             
             
             if (ataqueAleatorio ==0) {
                 
                ataque0 = Malaquian.GolpeBasico();
                 
                 if (ataqueAleatorio ==1) {
                     
                     ataque0 = Malaquian.golpeIntermedio();
                 }               
                 
             }
             else {             
                   ataque0 = Malaquian.GolpeFuerte();
             }
             
             System.out.println(Malaquian.getNombre() + " realizo un ataque de :" + ataque0 + "\n");
             
             Kairos.daño(ataque0);
             
                  if (Kairos.getVida() <= 0) {
                      
                      Pj1 = false;                      
                  }
                  else{
                      
                      Pj2 =false;                  
                  } 
                  
               System.out.println(Kairos.getNombre() + " Tiene una vida de :" + Kairos.getVida() + "\n");
               System.out.println(Malaquian.getNombre() + " Tiene una vida de :" + Malaquian.getVida() + "\n");
               
                  if (Kairos.getVida() > Malaquian.getVida()) {
                      
                      System.out.println("El Ganador es Karios!!!");                      
                  }
                  
                  if (Malaquian.getVida() > Kairos.getVida()) {
                      
                      System.out.println("El Ganador es Malaquian!!!");
                      
                  }
                  
                  if (Kairos.getVida()== Malaquian.getVida()) {
                      
                      System.out.println(" Hay un empate!!!");
                      
                  }
                 
             }  
              
                 
                       
        } while (Pj1  && Pj2);
        
         
         
         
         
         
         
         
         
         
         
         
         
    }
    
}
