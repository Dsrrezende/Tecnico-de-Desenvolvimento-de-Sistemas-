programa {
  //VARIAVEIS
  inteiro dividendo, divisor, quociente, resto
  // INÍCIO
  funcao inicio() {
    //INPUT
    escreva("Digite o dividendo: ")
    leia(dividendo)
    escreva("Digite o divisor: ")
    leia(divisor)
    quociente = dividendo / divisor
    resto = dividendo % divisor
    //OUTPUT
    escreva(dividendo," / ",divisor," = ",quociente, " resto ", resto)
    
  }
}
