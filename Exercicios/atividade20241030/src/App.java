import java.util.Scanner;
public class App {
    public static void exibe(JogadorDeFutebol jogador){
        System.out.println( "Nome: "+jogador.getNome()+"\nAno de Nascimento: "+jogador.anoNascimento+"\nAltura: "+jogador.altura+" m"+"\nPeso: "+jogador.peso+"Kg"+"\nNacionalidade: "+jogador.nacionalidade+"\nPosição: "+jogador.posicao);
    }

    public static JogadorDeFutebol leDados(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Insira os dados do Jogador:");
        System.out.println("Nome:");
        String nome = s.next();
        System.out.println("Ano de nascimento:");
        int anoNascimento = s.nextInt();
        System.out.println("Altura:");
        double altura = s.nextDouble();
        System.out.println("Peso:");
        double peso = s.nextDouble();
        System.out.println("Nacionalidade:");
        String nacionalidade = s.next();
        System.out.println("Posição:");
        s.nextLine();
        String posicao = s.nextLine();

        JogadorDeFutebol jogador = new JogadorDeFutebol(nome, posicao,anoNascimento, nacionalidade, altura, peso);
        return jogador;
    }

    public static void calcAposentadoria(JogadorDeFutebol jogador){
        if(jogador.posicao.equals("atacante")){
            System.out.println( "Falta "+(35 - jogador.calculaIdade())+" anos para o jogador "+jogador.getNome()+" se aposentar");
        }else if(jogador.posicao.equals("defesa")){
            System.out.println( "Falta "+(40 - jogador.calculaIdade())+" anos para o jogador "+jogador.getNome()+" se aposentar");
        }else{
            System.out.println( "Falta "+(38 - jogador.calculaIdade())+" anos para o jogador "+jogador.getNome()+" se aposentar");
        }
    }
    public static void main(String[] args) throws Exception {
        JogadorDeFutebol jogador = new JogadorDeFutebol(null, null, 0, null, 0, 0);

        jogador = leDados();
        System.out.println();
        exibe(jogador);
        System.out.println();
        calcAposentadoria(jogador);
        
    }
}
