import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int operacao = 1;
        double x,y,z;
        
        Scanner leitor = new Scanner(System.in);
        
        do {

            System.out.println("Informe o primeiro numero:");
            x = leitor.nextDouble();
            
            while(operacao != 0){
                System.out.println("0 = Sair da calculadora");
                System.out.println("1 = Soma");
                System.out.println("2 = subtraçao");
                System.out.println("3 = Multiplicação");
                System.out.println("4 = Divisão");
                System.out.println("5 = Limpar memória");
                
            
         
            operacao = leitor.nextInt();
           
            if (operacao == 1){
                System.out.println("Informe outro numero:");
                y=leitor.nextDouble();
                z=Soma(x, y);
                System.out.println("");
                System.out.println("Resultado: "+ z);
                x=z;
            }
            
            if(operacao == 2){
            
                System.out.println("Informe outro numero:");
                y=leitor.nextDouble();
                z=Subtracao(x, y);
                System.out.println("");
                System.out.println("Resultado: "+ z);
                x=z;
            }

            if(operacao == 3){
                System.out.println("Informe outro numero:");
                y=leitor.nextDouble();    
                z=Multiplicacao(x, y);
                System.out.println("");
                System.out.println("Resultado: "+ z);
                x=z;
            }

            if(operacao == 4){

                System.out.println("Informe outro numero:");
                y=leitor.nextDouble();    
                z=Dividisao(x, y);
                System.out.println("");
                System.out.println("Resultado: "+ z);
                x=z;
            }

            if(operacao == 5){
                x=0;
                System.out.println("memoria limpa");
                System.out.println(x);
                break;
            
            }
        

        
        }

        } while(operacao != 0);
        
        leitor.close();
    } 
    
    public static double Soma(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double Subtracao(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double Dividisao(double num1, double num2) {
        return num1 / num2;
    }
    
    public static double Multiplicacao(double num1, double num2) {
        return num1 * num2;
    }
}