//EXERCICIO 6 - 21/08/25
//A padaria Hotpao vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. Cada 
 //pãozinho custa R$ 0.50 e a broa custa R$ 5,00. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos 
 //pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado 
 //para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de 
 //broas, e depois calcular os dados solicitados. 

programa {
  inteiro paes, broas
  const real valorPao = 0.50, valorBroa = 5
  real totalVendas, poupanca, liquido
  funcao inicio() {
    escreva("BEM VINDO AO SIETEMA DE CÁLCULO DA PADARIA HOTPÃO\n","\n")
    escreva("Por favor informe quantos Pães foram vendidos: ")
    leia(paes)
    escreva("Por favor infome quantas Broas foram vendidas: ")
    leia(broas)
    totalVendas = ((paes*valorPao)+(broas*valorBroa))
    poupanca = ((totalVendas*10)/100)
    liquido = (totalVendas-poupanca)
    escreva("------------------------------------------------------\n")
    escreva("Você vendeu um total de R$ ",totalVendas,"\n")
    escreva("Você deverá guardar na Poupaça R$ ",poupanca,"\n")
    escreva("O valor total Líquido descontado a poupança será R$ ",liquido)
    escreva("\n------------------------------------------------------")
  }
}
