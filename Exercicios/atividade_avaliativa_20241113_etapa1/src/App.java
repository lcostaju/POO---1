import java.util.Scanner;

public class App {

    public static boolean valida(double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2)
            return false;
        else
            return true;
    }

    public static Retas leCoordenada() {
        Scanner s = new Scanner(System.in);
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        Retas reta;

        System.out.println("--Insira os valores das coordenadas:--");
        System.out.println("Valor de x1:");
        x1 = s.nextDouble();

        System.out.println("Valor de y1:");
        y1 = s.nextDouble();

        System.out.println("Valor de x2:");
        x2 = s.nextDouble();

        System.out.println("Valor de y2:");
        y2 = s.nextDouble();

        reta = new Retas(x1, y1, x2, y2);
        return reta;

    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Retas reta;
        char repete = 's';
        boolean validCoor = true;
        int cont = 0;

            do{
                reta = leCoordenada();
                validCoor = valida(reta.getX1(), reta.getY1(),reta.getX2(),reta.getY2());

                while (!validCoor) {
                    System.out.println("Coordenadas invalidas! Didite novamente");
                    reta = leCoordenada();
                    validCoor = valida(reta.getX1(), reta.getY1(),reta.getX2(),reta.getY2());
                }
            System.out.println(reta.exibe());
            cont ++;
            System.out.println("Retas calculadas: "+cont);  
            System.out.println("Deseja repetir o calculo? Sim(s) Não(Qualquer tecla)");
                repete = s.next().charAt(0);
            }while(repete == 's' || repete == 'S');
    }
}
