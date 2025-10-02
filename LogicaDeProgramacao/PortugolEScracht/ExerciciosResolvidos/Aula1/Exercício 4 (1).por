//EXERCÍCIO 4 -FAÇA UM PROGRAMA COM DUAS VARIÁVEIS ANO_NASCIMENTO QUE RECEBERÁ O ANO QUE VOCÊ NASCEU E OUTRA VARIÁVEL COM O NOME ANO_FUTURO
// QUE DEVERÁ SER ATRIBUÍDO O VALOR 2035. CRIAR UMA VARIÁVEL COM O NOME RESULTADO PARA CALCULAR A DIFERENÇA. NO FINAL ESCREVA NA TELA QUAL SERÁ A SUA IDADE EM 2035.)
programa {
  inclua biblioteca Calendario
  //variáveis
  inteiro ano_nascimento, resultado
  const inteiro ano_futuro = 2035
  inteiro ano_atual = Calendario.ano_atual()
  //funcao inteiro ano_atual()
  //Início do programa
  funcao inicio() {
    //input

    escreva("Digite seu ano de nascimento: ")
    leia(ano_nascimento)
    resultado = (ano_atual - ano_nascimento)
    //output
    escreva("\n")
    escreva("Você tem ", resultado," Anos.","\n")
    escreva("Sua idade em 2035 será de ", (ano_futuro - ano_nascimento)," Anos.","\n")
  }
}
