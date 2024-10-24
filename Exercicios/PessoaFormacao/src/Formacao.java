public class Formacao {
    
    //Atributos
    public String nivel;
    public boolean concluido;
    public String instituicao;
    public int ano;

    //Construtor
    public Formacao(String nvl,boolean cocl,String inst,int ano){
        nivel = nvl;
        concluido = cocl;
        instituicao = inst;
        this.ano = ano;
    }

    public String exibe(){
        return "Nivel: "+nivel+" Concluido: "+(concluido?"Sim":"Não")+" Instituicao: "+instituicao+" Ano:"+ano;
    }
}
