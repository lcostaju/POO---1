import java.util.Scanner;

public class App {
    // Metodo para ler pessoas
    public static Pessoa lePessoa() {

        String nome;
        char sexo;
        int idade;
        // Input de dados
        Scanner s = new Scanner(System.in);
        System.out.println("Dados da Pessoa\n");
        System.out.print("Digite o nome:");
        nome = s.next();
        System.out.println();
        System.out.print("Digite o sexo (m ou f):");
        sexo = s.next().charAt(0);
        System.out.println();
        System.out.print("Digite a idade:");
        idade = s.nextInt();
        System.out.println();

        // Inicializando o objeto
        Pessoa pess = new Pessoa(nome, sexo, idade);
        return pess;
    }

    // metodo para ler formação
    public static Formacao leFormacao() {
        String nivel;
        boolean concluido;
        String instituicao;
        int ano = 2024;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite os dados de formação");
        System.out.print("Digite o nivel:");
        nivel = s.next();
        System.out.println();
        System.out.print("Digite se foi concluido(true ou false):");
        concluido = s.nextBoolean();
        System.out.println();
        System.out.print("Digite a Instituição: ");
        instituicao = s.next();
        if(concluido){
            System.out.println("Digite o ano de conclusão: ");
            ano = s.nextInt();
        }
        Formacao form = new Formacao(nivel, concluido, instituicao, ano);
        return form;

    }

    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        Pessoa pessoa = new Pessoa("",'m', 0);

        Formacao formacao = new Formacao(null, false, null, 0);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("--Menu--");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Cadastrar Formação");
            System.out.println("3 - Exibir");
            System.out.println("4 - Atualizar Idade");
            System.out.println("5 - Sair");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    pessoa = lePessoa();
                    break;
                case 2:
                    formacao = leFormacao();
                    break;
                case 3:
                    System.out.println("Pessoa: "+pessoa.exibe()+"\n"+"Formação: "+formacao.exibe());
                    break;
                case 4:
                    pessoa.idade = s.nextInt();
                default:
                    break;
            }

        }
    }
}
