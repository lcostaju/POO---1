import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class App {

    public static void exibe(FichaPessoal ficha){

        System.out.println("Nome: "+ficha.getNome()+"\nIdade: "+ficha.getIdade());
    }

    public static void exibeFichas(ArrayList<FichaPessoal> list) {
        for (FichaPessoal ficha : list) {
            System.out.println("Nome: " + ficha.getNome() + ", Idade: " + ficha.getIdade());
        }
    }

    public static FichaPessoal le(){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = s.nextLine();
        System.out.println("Digite a idade:");
        int idade = s.nextInt();

        FichaPessoal ficha = new FichaPessoal(nome, idade);
        return ficha;
    }
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        char continua = 's';
        ArrayList<FichaPessoal> fichas = new ArrayList<FichaPessoal>();

        do{
            System.out.println("Insira os dados da ficha");
            fichas.add(le());
            System.out.println("Deseja inserir mais dados? (s)Sim (n)Não");
            continua = s.next().charAt(0);

        }while(continua == 's');
        
        exibeFichas(fichas); 
        System.out.println("Quantidade de cadastros: "+FichaPessoal.getQuantidade());
    }
}
