programa {
  caracter parar
  funcao inicio() {
    parar = 'N'
    enquanto (parar != 'S'){
      escreva("Deseja parar o loop? (S/N): ")
      leia(parar)
    }
    escreva("você finalizou o loop!")
    
  }
}
