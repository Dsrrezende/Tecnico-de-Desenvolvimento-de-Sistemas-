programa {
  //Bibliotecas
  inclua biblioteca Matematica-->m
  
  //Função #1
  funcao real calculoImc (real peso, real altura){
    retorne peso/(altura*altura)
  }
  //Função #2
  funcao cadeia classificacao(real imc, caracter genero){
    //Classificação Feminina:

    se (imc < 19 e genero == 'f'){
      retorne "ABAIXO DO PESO"
    }senao se (imc < 24 e genero == 'f'){
      retorne "PESO NORMAL"
    }senao se (imc < 29 e genero == 'f'){
      retorne "OBESIDADE LEVE"
    }senao se (imc < 39 e genero == 'f'){
      retorne "OBESIDADE MODERADA"
    }senao se (imc >= 39 e genero == 'f'){
      retorne "OBESIDADE MÓRBIDA"
    }

    //Classificação Masculina

    se (imc < 20 e genero == 'm'){
      retorne "ABAIXO DO PESO"
    }senao se (imc < 25 e genero == 'm'){
      retorne "PESO NORMAL"
    }senao se (imc < 30 e genero == 'm'){
      retorne "OBESIDADE LEVE"
    }senao se (imc < 40 e genero == 'm'){
      retorne "OBESIDADE MODERADA"
    }senao se (imc >= 40 e genero == 'm'){
      retorne "OBESIDADE MÓRBIDA"
    }
  }
  //Função #3
  funcao cadeia cadeiaGenero(caracter genero){
    se(genero == 'f'){
      retorne "Feminino"
    }senao se(genero == 'm'){
      retorne "Masculino"
    }
  }
  //função #4
  funcao cabecario(){
    escreva("---------------------------------------------------\n")
    escreva("INSTITUIÇÃO: Firjan Senai - Petrópolis-RJ\n")
    escreva("CURSO: Técnico de Desenvolvimento de Sistemas\n")
    escreva("NOME DO ALUNO: Douglas de Sousa Rezende\n")
    escreva("PROFESSOR: Marco Aurelio\n")
    escreva("AVALIAÇÃO: Revisão Portugal\n\n")
    escreva("*********** BEM VINDO A CALCULADORA DE IMC ************\n")
    escreva("\n----------------------------------------------------\n")
  }

  //Código Principal
  funcao inicio() {
    real peso, altura, resultadoImc
    cadeia nome, resultadoClassificacao,retornoGenero
    caracter genero

    cabecario()

    escreva("Por favor informe seu nome: ")
    leia (nome)

    peso = -1
    enquanto (peso <= 0){
      escreva("Por favor informe seu peso em Kg (EX: 85.4): ")
      leia(peso)
    }
    altura = -1
    enquanto (altura <= 0){
      escreva("Por favor informe sua altura em metros (EX: 1.70): ")
      leia(altura)
    }
    escreva("Por favor informe seu Gênero\n","Para Masculino digte [m], Para Feminino digite [f]: ")
    leia(genero)

    resultadoImc = calculoImc(peso,altura)
    resultadoClassificacao = classificacao(resultadoImc,genero)
    retornoGenero = cadeiaGenero(genero)
    escreva("\n----------------------------------------------------------------------------------\n")
    escreva("Olá, ",nome,"!"," Seu IMC é ",m.arredondar(resultadoImc,2)," e sua classificação é '",resultadoClassificacao,"' para o gênero ",retornoGenero,".")
    escreva("\n----------------------------------------------------------------------------------\n")
  }
}
