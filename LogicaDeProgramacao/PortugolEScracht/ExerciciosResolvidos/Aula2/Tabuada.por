//Exercicio 2 - 26-08-25 -->
programa {
  inteiro nun, tab, nun2

  funcao inicio() {
    escreva("Informe o número que você gostaria de saber a tabuada: ")
    leia(nun)
    escreva("informe quantos números deseja na tabuada: ")
    leia(nun2)
    para(inteiro i=0;i<=nun2;i++) 
    escreva("\n",nun," X ",i, " = ",nun*i)
    escreva("\n")
    
  }
}
