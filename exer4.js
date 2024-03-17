//ARTHUR RODRIGUES PÓRTELA
//DENISE XAVIER DE ALEMIDA
//ADRIEL XAVIER PEREIRA DA SILVA
//LUIS FELIPE SANTOS RIZZARO
/*
4. Peça para o usuário digitar o número de produtos vendidos, o preço unitário de cada produto e o valor do frete e forneça o custo total da venda.

usuario escolher produtos >/ fazer variaveis com produto e preço >/

somar tudo > caso o valor passe de tal valor frete grátis ou acrescenta 
valor de 20 reis > somar a quantidade de produtos vendidos. */
let resul = document.getElementById("resultado")
let vendas = prompt("Digite a quantidade de vendas, até 5 unidades:");
let preco_1 = prompt("Venda 1:") * 1; 
let preco_2 = prompt("Venda 2:") * 1; 
let preco_3 = prompt("Venda 3:") * 1;
let preco_4 = prompt("Venda 4:") * 1;
let preco_5 = prompt("Venda 5:") * 1;

function calculoFrete(){
    let soma = preco_1 + preco_2 + preco_3 + preco_4 + preco_5;
        if ( soma >= 120){
            return alert(`O valor da compra foi de ${soma} reais.`);
        } else{
            let frete = soma + 15
            return alert(`O valor da compra foi de ${frete}, por conta do frete.`);
        }
}
calculoFrete();

