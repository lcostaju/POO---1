import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int numero = le();
        exibe(par(numero));
    }
    //1 -função que retorna valor e não tem parametros
    public static int le(){
        Scanner s = new Scanner(System.in);        
        System.out.print("Digite um valor Inteiro positivo:");
        int valor = s.nextInt();
        while(valor<0){
            restricao();
            System.out.print("Digite um valor Inteiro positivo:");
            valor = s.nextInt();
        }
        s.close();
        return valor;
    }
    //2 - função que não retorna valor e não tem parametros
    public static void restricao(){
        System.out.println("Valor digitado não é inteiro");
    }
    //3 - função que não retorna valor e tem parametros
    public static void exibe(boolean par){
        if (par) {
            System.out.println("O numero digitado é par");
        }else{
            System.out.println("O numero digitado é impar");
        }
    }
    //4 - função que retorna valor e tem parametros
    public static boolean par(int numero){
        boolean par = false;
        if (numero %2 == 0) {
            par = true;
        }
        return par;
    }
}
