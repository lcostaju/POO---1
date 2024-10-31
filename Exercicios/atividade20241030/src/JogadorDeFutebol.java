import java.time.LocalDate;
public class JogadorDeFutebol {
    //public String nome;
    private String nome;
    public String posicao;
    public int anoNascimento;
    public String nacionalidade;
    public double altura;
    public double peso;

    public JogadorDeFutebol(String nome, String posicao, int anoNascimento, String nacionalidade, double altura,
            double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.anoNascimento = anoNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String exibe(){
        return "Nome:"+nome+"\nAno de Nascimento:"+anoNascimento+"\nAltura: "+altura+" m"+"\nPeso: "+"Kg"+"\nNacionalidade:"+nacionalidade+"\nPosição:"+posicao;
    }

    public int calculaIdade(){
        return (LocalDate.now().getYear())-anoNascimento;
    }
}
