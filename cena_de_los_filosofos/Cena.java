
package com.mycompany.cena_de_los_filosofos;

public class Cena{  //constructor con parametros
 Tenedor tenedores[];  
 int parametro = 8;         //numero de filosofos y tenedores  
public static void main(String args[]){  
 
 Cena cena = new Cena();  
 System.out.println("Cena de los Filosofos");  
 for(int i=0; i<8; i++){  
  Filosofo pensante = new Filosofo(i, cena);  
 }  
}  
public Cena(){  
 tenedores = new Tenedor[parametro];  
 for(int i=0; i<8; i++){  
  tenedores[i] = new Tenedor(i);  
 }  
}  
public Tenedor getTenedor(int x){  
 return tenedores[x];  
 }  
public int getTenedorDer(int x){  
 return (x+1)%parametro;  
 }  
public int getTenedorIzq(int x){  
 return x;  
 }  
}  
