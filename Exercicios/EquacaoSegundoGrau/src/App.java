import java.util.Scanner;

public class App {
    public static double le(int input) {
        // System.out.println("Digite um valor maior que 0");
        Scanner s = new Scanner(System.in);
        switch (input) {
            case 1:
                System.out.print("Digite um valor maior que 0 para o coeficiente a: ");
                return s.nextDouble();
            case 2:
                System.out.print("Digite um valor maior que 0 para o coeficiente b: ");
                return s.nextDouble();
            default:
                System.out.print("Digite um valor maior que 0 para o coeficiente c: ");
                return s.nextDouble();
        }
    }

    public static String exibe(double x1, double x2) {
        return "As raizes da equaçao são: x1 = " + x1 + " x2 = " + x2;
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double a = 0, b = 0, c = 0, delta = 0, x1 = 0, x2 = 0;
        char continuar = 's';

        while (continuar == 's') {

            // Recebe os valores dos coeficientes
            // Coeficiente a
            do {
                a = le(1);
                if (a == 0) {
                    System.err.println("Erro: O valor deve ser diferente de 0");
                }
            } while (a <= 0);
            // Coeficiente b
            b = le(2);
            
            c = le(3);
            
            //Instancia objeto da classe EGrau2
            EGrau2 equacao = new EGrau2(a, b, c);
            //Executa o metodo calcDelta da classe EGrau2
            delta = equacao.calcDelta();

            
            if (delta < 0) {//Caso o delta seja negativo retorna erro
                System.err.println("O delta nao pode ser menor que 0");
                continuar = 'n';
            } else {//Caso não seja negativo
                //Executa metodo para calcular raiz x1
                x1 = equacao.calcX1(delta);
                //Executa metodo para calcular raiz x2
                x2 = equacao.calcX2(delta);
                //Exibe o resultado
                System.out.println(exibe(x1, x2));
                //Informa ao usuário se deseja calcular uma nova equação
                System.out.print("Deseja resolver uma nova equação?\n Digite [s] para sim e [n] para não: ");
                continuar = s.next().charAt(0);
            }

        }

    }

}
