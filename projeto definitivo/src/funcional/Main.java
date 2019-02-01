package funcional;
import estrutura.zoologico;
import java.util.Scanner;

public class Main {
  public static void main(String[]args){
      int i=9;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Bem vindo");
      System.out.println("Selecione a opção que deseja continuar");
      
      while(i != 0){
          System.out.println("Inicar jogo - [1]");
          System.out.println("Carregar Jogo - [2]");
          System.out.println("Sair - [0]");
          
          int op = input.nextInt();
          
          switch(op){
              case 1:
                  zoologico zoo = new zoologico();
          }
          
  }      
      
      
  }   
}

