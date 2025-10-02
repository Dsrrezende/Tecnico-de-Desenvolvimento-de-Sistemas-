//EXERCICIO 7 - 21-08-25
//7)Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do litro de gasolina e o valor do pagamento
//e exibir quantos litos ele conseguiu colocar no tanque.

programa {
  //inclusão de Biblioteca
  inclua biblioteca Matematica --> mat
  //Variáveis
  real gasLitro, reaisPago, litrosAbastecidos, arredondado
  funcao inicio() {
    //input
    escreva("Informe o valor pago por litro de Gasolina R$: ")
    leia(gasLitro)
    escreva("Informe quanto Reais você pagou pelo abastecimento R$: ")
    leia(reaisPago)
    //lógica matemática
    litrosAbastecidos = (reaisPago/gasLitro)
    arredondado = mat.arredondar(litrosAbastecidos,2)//comando "arredondar" encontra-se dentro da Biblioteca Matématica
    //output
    escreva("\n------------------------------------------------------\n")
    escreva("Você abasteceu ",arredondado," Litros")
    escreva("\n------------------------------------------------------\n")
  }
}
