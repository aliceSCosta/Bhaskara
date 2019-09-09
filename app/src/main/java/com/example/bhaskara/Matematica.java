package com.example.bhaskara;

import java.io.PrintStream;

public class Matematica {

   public double Exponenciacao(double base, int expoente){
       double resultado = base;
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

   public double CalculaDelta(double a, double b, double c){
       
       return resultado;
   }

    public double[] CalculaRaizesEq2Grau(double a, double b, double c){
       double delta = CalculaDelta(a, b, c);
       double[] raizes = null;

       if (delta >= 0){
           raizes = new double[2];
           raizes[0] = -b / (2 * a);
           raizes[1] = raizes[0];
       }


        return raizes;
    }
}

