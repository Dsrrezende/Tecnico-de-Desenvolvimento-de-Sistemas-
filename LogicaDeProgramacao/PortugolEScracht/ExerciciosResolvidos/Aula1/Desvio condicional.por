//Desvio condicional
//"=="" é um comando para verificar uma condição.
//CONDICIONAIS ("se, senao,")
//Operadores logicos ("e","ou",não,maior >, menor <, maior ou igual>=, menor ou igual <=, diferente!=, igual ==)
programa {
  funcao inicio() {
    cadeia nome, senha
    escreva("Digite seu nome de Usúario: ")
    leia(nome)
    escreva("Digite sua Senha: ")
    leia(senha)
    se(nome == "Raul" e senha =="Minha senha")
    escreva("Bem vindo ", nome,"\n")
    senao
    esceva("Acesso negado!!! \n")
    
  }
}
