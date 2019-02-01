package estrutura;
import java.util.Scanner;

public class zoologico {
  int populariadade;
  double conta = 5000;
  double atrações;
  int animais;
  
    public zoologico(){
        System.out.println("Para sua primeira escolha, terá algumas opções de locais para estabelecers o zoologico em sua primeira cidade");
        System.out.println("Seu valor inicial é 5k");
        System.out.println("Localização 1 - Valor 2500, Populariade +10, Atrações +5");
        System.out.println("Localização 2 - Valor 3500, Populariade +15, Atrações +10 ");
        System.out.println("Localização 3 - Valor 4500, Populariade +20, Atrações +15 ");
        Scanner input = new Scanner(System.in);      
        int local = input.nextInt();
        
        if(local == 1){
            this.conta = this.conta - 2500;
            this.populariadade = 10;
            this.atrações = 5;
        }
        if(local == 2){
            this.conta = this.conta - 3500;
            this.populariadade = 15;
            this.atrações = 10;
        }
        if(local == 3){
            this.conta = this.conta - 4500;
            this.populariadade = 20;
            this.atrações = 15;
        }
        jogo();
    }  
    public void jogo(){
        int op=1;
        System.out.println("O tempo irá passar de modo semanal");
        System.out.println("Ao deixar a primeira semana começar, no final, você irá receber o relatorio semanal dos gastos e possiveis acontecimentos");
        while(op != 3){
        System.out.println("Deseja fazer algum upgrade no zoologico - [1]");
        System.out.println("Iniciar a semana - [2]");
        System.out.println("Salvar e sair - [3]");
        Scanner input = new Scanner(System.in);
        op = input.nextInt();
        
        
        }
        
        
        
        
        
        
    }
}
