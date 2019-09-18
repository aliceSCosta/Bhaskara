package com.example.bhaskara;

import java.io.PrintStream;

public class Matematica {

   public Double Exponenciacao(double base, int expoente){
       Double resultado = base;
       int potencia;

       if (expoente == 0) return 1.0;

       resultado = base;
       potencia = expoente;

       if (expoente < 0) potencia *= -1;

       for (int i = 2; i <= potencia; i++){
               resultado *= base;
       }

       if (expoente < 0) resultado = 1.0 / resultado;

       return resultado;
       //if (expoente == 0){
         //  resultado = 1;
      // }
       //else
       //{
          // resultado = base
         //  for (int i = 2; i < resultado; i++){
          //     resultado *= base;
          // }
       //}


   }

   public Double CalculaDelta(double a, double b, double c){
       Double resultado;

       resultado = Exponenciacao(b, 2) - 4 * a * c;

       return resultado;
   }

    public Double[] CalculaRaizesEq2Grau(double a, double b, double c){
       Double delta = CalculaDelta(a, b, c);
       Double[] raizes = null;

       if (delta >= 0){
           raizes = new Double[2];
           raizes[0] = -b / (2 * a);
           raizes[1] = raizes[0];
       }


        return raizes;
    }
}

