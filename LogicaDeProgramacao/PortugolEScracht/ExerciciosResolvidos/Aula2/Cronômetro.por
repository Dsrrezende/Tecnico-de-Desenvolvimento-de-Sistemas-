//Exercicio 1 - 26-08-25 -->
programa {
  inclua biblioteca Util 
  inteiro nunSeg
  funcao inicio() {
    
    faca{
      escreva("Digite um número em segundos ( de 1s a 59s): ")
      leia(nunSeg)
      se(nunSeg>=1 e nunSeg<=59){
        para (inteiro i=0 ; i<=nunSeg ; i++ ){
        limpa()
        escreva("Cronômetro ... ",i,"\n")
        Util.aguarde(1000)
      }
      }senao{
        escreva("Você digitou uma opção invalida, tente novamnete...\n")
        Util.aguarde(3000)
        limpa()
      }
    }enquanto(nunSeg<1 ou nunSeg>59)
    
  }
}
