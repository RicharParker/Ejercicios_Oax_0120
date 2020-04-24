/// VOLUMEN DEL CUBO ///

#include <stdio.h>
#include <math.h>
#define PI 3.1416

int main() //Funcion principal
{

   float altura, radio,volumen,lado;//Variables

     printf("\nIngrese la medida de un lado del cubo: ");
     scanf("%f",&lado);

     volumen = pow(lado,3);

     printf("\nEl volumen del cubo es: %.1f",volumen);

    /// VOLUMEN DEL CILINDRO ///

     printf("\nIngrese la altura del cilindro: ");
     scanf("%f",&altura);
     printf("\nIngrese el radio del cilindro: ");
     scanf("%f",&radio);

     volumen = (radio*radio)*PI*altura;

     printf("\nEl volumen del cilindro es: %.2f",volumen);

        return 0;
}

