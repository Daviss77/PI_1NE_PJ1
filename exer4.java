//ADRIEL XAVIER PEREIRA DA SILVA
//ARTHUR RODRIGUES PORTELA
//DENISE XAVIER DE ALMEIDA

import java.util.Scanner;


public class exer4 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de até 4 vendas:");
    String vendasProdutos = scanner.nextLine();

    System.out.println("Digite o preço da venda 1:");
    String precoProdutos = scanner.nextLine();
       
    System.out.println("Digite o preço da venda 2:");
    String precoProdutos1 = scanner.nextLine();

    System.out.println("Digite o preço da venda 3:");
    String precoProdutos2 = scanner.nextLine();    
  
    System.out.println("Digite o preço da venda 4:");
    String precoProdutos3 = scanner.nextLine();
    
    int p1 = Integer.parseInt(precoProdutos);
    int p2 = Integer.parseInt(precoProdutos1);
    int p3 = Integer.parseInt(precoProdutos2);
    int p4 = Integer.parseInt(precoProdutos3);

    int soma =p1 + p2 + p3 + p4;
        if (soma >= 120){
            String resultado = String.format( "A quantidade de vendas foi de %s. O preço total de %d", vendasProdutos, soma);
            System.out.println(resultado);
        }
        else{
            int frete = soma + 20;
            String freteSoma = String.valueOf(frete);
            String resultado = String.format("A quantidade de vendas foi de %s. O preço total + frete foi de %s",vendasProdutos, freteSoma);
            System.out.println(resultado);
        }

    

        scanner.close();
}
}
