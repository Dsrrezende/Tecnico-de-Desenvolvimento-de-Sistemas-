//AULA 19/08/2025 
//DECLARAÇÃO DE VARIAVEIS,
//TIPOS DE VARIAVEIS(CADEIA, INTEIRO, REAL E CARACTERE) 
//COMANDOS "ESCREVA", "LEIA" E "\n"

//INICIO DO PROGRAMA
programa {
  //variáveis
  cadeia nome
  inteiro idade
  real peso, altura
  caracter estado_civil

  funcao inicio() {
    
    //input
    escreva("Digite seu nome: ")
    leia(nome)
    escreva("Digite sua idade: ")
    leia(idade)
    escreva("Digite seu peso: ")
    leia(peso)
    escreva("Digite sua altura em Metros: ")
    leia(altura)
    escreva("Informe seu estado cívil, Digite [S] para solteiro ou [C] Casado: ")
    leia(estado_civil)
    
    //output
    escreva("\n")
    escreva("######################################","\n")
    escreva("Nome:",nome,"\n")
    escreva("A sua idade é: ",idade," Anos","\n")
    escreva("Voce pesa: ",peso,"Kg","\n")
    escreva("A sua altura é : ",altura,"M","\n")
    escreva("O seu estado cívil é: ",estado_civil,"\n")
    escreva("O seu IMC é: ",peso/(altura*altura),"\n")
    escreva("######################################","\n")
  }
}
