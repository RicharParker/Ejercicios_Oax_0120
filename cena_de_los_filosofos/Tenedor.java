
package com.mycompany.cena_de_los_filosofos;

public class Tenedor{  //constructor con parametros
  
int numero;  
boolean enUso;  // variable booleana
   
public Tenedor(int x){  
 numero = x;  
 }  
  
synchronized public void usar(){   //proteje el bloque de codigo de un multiprocesamiento no deseado
      if(enUso){  
         System.out.println("Tenedor "+numero+" esta en uso, espera");  
      }else{  
         enUso= true;  
         System.out.println("Se esta usando el tenedor "+numero);  
      }  
}  
  
synchronized public void dejar(){   //proteje el bloque de codigo de un multiprocesamiento no deseado
      enUso = false;  
      System.out.println("Tenedor "+numero+" esta ahora disponible");  
   }  
}  
