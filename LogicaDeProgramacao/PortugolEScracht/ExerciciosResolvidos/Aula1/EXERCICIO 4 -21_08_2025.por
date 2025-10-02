programa{
  inteiro idade, sexo, gest, def_fis
	funcao inicio(){
		// Entrada da idade
		escreva("Digite sua idade: ")
		leia(idade)
		
		// Verifica se tem 60 anos ou mais
		se (idade >= 60) {
			escreva("Fila preferencial")
		} senao {
			// Pergunta o sexo
			escreva("\nQual o seu sexo:\n")
			escreva("PARA FEMININO DIGITE [1], PARA MASCULINO DIGITE [2]\n")
			escreva("Digite a opção escolhida: ")
			leia(sexo)
			
			// Caso mulher
			se (sexo == 1) {
				escreva("\nVocê é gestante?:\n")
				escreva("PARA SIM DIGITE [1], PARA NÃO DIGITE [2]\n")
				escreva("Digite a opção escolhida: ")
				leia(gest)
				
				se (gest == 1) {
					escreva("Fila preferencial")
				} senao {
					escreva("\nVocê é deficiente físico?:\n")
					escreva("PARA SIM DIGITE [1], PARA NÃO DIGITE [2]\n")
					escreva("Digite a opção escolhida: ")
					leia(def_fis)
					
					se (def_fis == 1) {
						escreva("Fila preferencial")
					} senao {
						escreva("Fila comum")
					}
				}
			} senao { // Caso homem
				escreva("\nVocê é deficiente físico?:\n")
				escreva("PARA SIM DIGITE [1], PARA NÃO DIGITE [2]\n")
				escreva("Digite a opção escolhida: ")
				leia(def_fis)
				
				se (def_fis == 1) {
					escreva("Fila preferencial")
				} senao {
					escreva("Fila comum")
				}
			}
		}
	}
}
