//Aula 21/08/2025--> 
programa {
  //variáveis
  //temp *1.8 + 32
  real temCel, temFar 

  //Início do programa
  funcao inicio() {
    //input
    escreva("Digite o valor da temperatura em Celsius: ")
    leia(temCel)
    temFar = temCel * 1.8 + 32
    //output
     escreva(temCel, " graus Celsius é o mesmo que ", temFar, " graus em Fahrenheit")
  }
}
