
package com.mycompany.cena_de_los_filosofos;

public class Filosofo implements Runnable{ //metodos propios  
  
   private final Thread hilo;//una variable es de tipo constante: no admitirá cambios después de su declaración y asignación de valor  
   protected Cena cena;  
   protected int tizq, tder;  //cualquier clase del mismo paquete y subclases pueden acceder al miembro
   protected int numero;  
  
public Filosofo (int x, Cena cena){   //indicando el tipo de variable y tomando los hilos de la clase cena
      this.numero= x;  //variable que hace referencia al objeto actual
      this.cena= cena;  //es una referencia al objeto invocado (es decir, el objeto sobre el que se llama el método)
      tizq= cena.getTenedorIzq(numero);  
      tder= cena.getTenedorDer(numero);  
      hilo = new Thread(this);  
      hilo.start();  
   }  
public void pensar(){  //clase en estado de espera
     try{   // va a poner a dormir el hilo cada cierto tiempo
        System.out.println ("Filosofo "+numero+" pensando");  
        int espera = (int)(Math.random()*1000);  //generamos un entero aleatorio a partir de un rango adecuado.
        Thread.sleep(espera);  //cuanto tiempo pasa antes de que este hilo se ejecute, o cuanto cierto tiempo se va a dormir y despues sigue en el proceso
        System.out.println ("Filosofo "+numero+" tiene hambre");  
     }catch(InterruptedException e){  //maneja las exepciones
     }  
}  
public void tomarTenedores(){  //clase para tomar tenedores
     System.out.println ("Tomando tenedores");  
     Tenedor t1= cena.getTenedor(tizq); //inicia en 0 
     Tenedor t2= cena.getTenedor(tder);  //se pasa al siguiente numero
     t1.usar();  
     t2.usar();  
}  
public void comer(){  
     try{  // va a poner a dormir el hilo cada cierto tiempo
        System.out.println("Filosofo "+numero+" esta comiendo");  
        int espera= (int)(Math.random()*700);  //generamos un entero aleatorio a partir de un rango adecuado.
        Thread.sleep(espera);  //cuanto tiempo pasa antes de que este hilo se ejecute, o cuanto cierto tiempo se va a dormir
        System.out.println("Filosofo "+numero+" esta satisfecho");  
     }catch(InterruptedException e){ //maneja las exepciones
     }  
}  
protected void dejarTenedores(){  
     System.out.println("Soltando los tenedores.");  
     Tenedor t1= cena.getTenedor(tizq);  //inicia en 0
     Tenedor t2= cena.getTenedor(tder);  //se pasa al siguiente numero
     t1.dejar();  
     t2.dejar();  
}  
   @Override  //sobrecarga los métodos 
   public void run(){  //estos objetos estan llamando al metodo
      while(true){  
         pensar();  
         tomarTenedores();  
         comer();  
         dejarTenedores();  
      }  
}  
}  