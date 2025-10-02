//Exercicio 5 - 
programa {
  const real valorSalario = 10
  const real valorHorasExtras= 15
  inteiro horasTrabalhadas, horasExtras
  real salarioAnual
  funcao inicio() {
    escreva("Digite o número de horas trabalhadas no ano: ")
    leia(horasTrabalhadas)
    escreva("Digite o número de horas extras no ano: ")
    leia(horasExtras)
    salarioAnual = horasTrabalhadas * valorSalario + horasExtras * valorHorasExtras
    escreva("O Salário anual é R$ ", salarioAnual)

    
  }
}
