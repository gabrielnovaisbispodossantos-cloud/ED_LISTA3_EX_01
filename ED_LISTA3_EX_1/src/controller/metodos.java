package controller;

public class metodos {
  public metodos () {
	  super();
  }
  public int contarDigitos(int n)
  {
   // Condição de parada:
   // Quando o número for menor que 10, ele possui apenas 1 dígito
   if(n < 10)
   {
    return 1;
   }

   // Relação de chamada:
   // número atual = 1 + quantidade de dígitos do número sem o último dígito
   return 1 + contarDigitos(n / 10);
  
  }}
