package exemploencapsulamento1;

public class Formacao {
    public String nivel, instituicao;
    public boolean concluido;
    public int ano;
    
    public Formacao(String nivel, String instituicao, boolean concluido , int ano){
        this.nivel=nivel;
        this.instituicao=instituicao;
        this.concluido=concluido;
        this.ano=ano;
    }        
   
}
