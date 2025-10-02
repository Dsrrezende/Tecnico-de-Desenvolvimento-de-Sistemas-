package LogicaDeProgramacao.Java.Aula2;
public class CurtoCircuito {
    public static void main(String[] args) {
        int a= 2, b = 5, c =10;
        
        if ((a>5) && (c>b)) {
            System.out.println("&& - somente a preimeira é avaliada");
        }
        if ((b==5)||(c==0)) {
            System.out.println("|| - Somente a primeira é avaliada");
        }
        if ((a>1)&(c>b)) {
            System.out.println("& - As duas expresões são avaliadas");
        }
        if ((b==5)|| (c==0)) {
            System.out.println("| - As duas expresões são avaliadas");
        }
    }
    
}
