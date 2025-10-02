/*EXERCICIO 5-Crie um algoritmo que receba login e senha e verifique as credenciais. Caso algum deles estiver errado o programa deve retornar ao
usuário quais das opções está errada, se é o login ou a senha. O programa deve bloquear o acesso após 3 tentativas erradas. Quando for a
última tentativa ele deve emitir um alerta:
"Última tentativa, mais um erro seu acesso será bloqueado!"*/
programa {
  inclua biblioteca Util-->u
  funcao inicio() {
    cadeia login, senha, loginDigitado, senhaDigitado
    inteiro tent = 0
    escreva("Cadastre seu login: ")
    leia(login)
    escreva("Cadastre sua senha: ")
    leia(senha)
    escreva("Login e senha cadastrados com sucesso.")
    u.aguarde(3000)
    limpa()
    enquanto(tent<3){
      escreva("Digite seu login: ")
      leia(loginDigitado)
      escreva("Digite sua senha: ")
      leia(senhaDigitado)
      se(loginDigitado==login e senhaDigitado==senha){
        escreva("Bem vindo ao sistema!")
        pare
      }senao{
        tent++
        se(loginDigitado!=login e senhaDigitado!=senha){
          escreva("Login e Senha invalidos.\n")
          u.aguarde(2000)
          limpa()
        }senao se(loginDigitado!=login){
          escreva("Login Invalido \n")
          u.aguarde(2000)
          limpa()
        }senao{
          escreva("Senha inválida")
          u.aguarde(2000)
          limpa()
        }
        se(tent==2){
          escreva("Ultima tentativa \n")
          u.aguarde(2000)
          limpa()
        }
      }
    }
  }
}
