package LogicaDeProgramacao.Java.Aula2;
public class CalculadoraSalario {
    public static void main(String[] args) {
        float salario = 6000f;
        float desconto;
        if (salario<=1751.81) {
            desconto = (salario*8)/100;
            System.out.println("Você tera um deconto de 8% do INSS correspondente a R$ "+desconto+ ", e o seu salario após o desconto de será de R$"+(salario-desconto));
        }else if (salario<=2919.72){
            desconto = (salario*9)/100;
            System.out.println("Você tera um deconto de 9% do INSS correspondente a R$ "+desconto+ ", e o seu salario após o desconto de será de R$ "+(salario-desconto));
        }else if (salario<=5839.45) {
            desconto = (salario*10)/100;
            System.out.println("Você tera um deconto de 10% do INSS correspondente a R$ "+desconto+ ", e o seu salario após o desconto de será de R$ "+(salario-desconto));
        }else{
            desconto = (salario*11)/100;
            System.out.println("Você tera um deconto de 11% do INSS correspondente a R$ "+desconto+ ", e o seu salario após o desconto de será de R$ "+(salario-desconto));
        }
    }
}
