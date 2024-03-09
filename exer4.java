import java.util.Scanner;


public class exer4 {
public static void main(String[] args) {
    Scanner vendas = new Scanner(System.in);
    System.out.println("Digite a quantidade de até 4 vendas:");
    String vendasProdutos = vendas.nextLine();

    Scanner preco = new Scanner(System.in);
    System.out.println("Digite o preço da venda 1:");
    String precoProdutos = preco.nextLine();
       
    Scanner preco1 = new Scanner(System.in);
    System.out.println("Digite o preço da venda 2:");
    String precoProdutos1 = preco1.nextLine();

    Scanner preco2 = new Scanner(System.in);
    System.out.println("Digite o preço da venda 3:");
    String precoProdutos2 = preco2.nextLine();    
  
    Scanner preco3 = new Scanner(System.in);
    System.out.println("Digite o preço da venda 4:");
    String precoProdutos3 = preco3.nextLine();
    
    int p1 = Integer.parseInt(precoProdutos);
    int p2 = Integer.parseInt(precoProdutos1);
    int p3 = Integer.parseInt(precoProdutos2);
    int p4 = Integer.parseInt(precoProdutos3);

    int soma =p1 + p2 + p3 + p4;
        if (soma >= 120){
            String resultado = String.format( "A quantidade de vendas foi de %d. O preço total de %d", vendasProdutos, soma);
            System.out.println(resultado);
        }
        else{
            int frete = soma + 20;
            String vendasString = String.valueOf(vendasProdutos);
            String freteSoma = String.valueOf(frete);
            String resultado = String.format("A quantidade de vendas foi de %s. O preço total + frete foi de %s",vendasString , freteSoma);
            System.out.println(resultado);
        }

    

        vendas.close();
        preco.close();
        preco1.close();
        preco2.close();
        preco3.close();
}
}