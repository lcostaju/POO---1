import java.util.Scanner;

public class App {
    // faça uma aplicação que exiba um menu 1 - inteiros, 2- reais, 3 -sair
    // A aplicação não pode ter as variaveis que representa os numeros interiros e
    // reais

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        char menu = '0';

        do {
            System.out.println("Escolha uma opção: 1 - inteiros, 2- reais, 3 -sair");
            menu = s.next().charAt(0);

            switch (menu) {
                case '1':
                    Dados1 d1 = new Dados1(10, 20);
                    Adicao1 a1 = new Adicao1();
                    System.out.println(a1.exibe(d1.getA(), d1.getB(), a1.add(d1.getA(), d1.getB())));
                    break;
                case '2':
                    Dados1 d2 = new Dados1(10.5f, 20.5f);
                    Adicao1 a2 = new Adicao1();
                    System.out.println(a2.exibe(d2.getC(), d2.getD(), a2.add(d2.getC(), d2.getD())));
                    break;
                default:
                    break;
            }

        } while (menu != '3');

    }
}
