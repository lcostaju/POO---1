package exemploencapsulamento1;
import teste.*;
import exemploencapsulamento1.Formacao;
import exemploencapsulamento1.Pessoa;
import javax.swing.JOptionPane;

public class App {

    public static Pessoa lePessoa(){
       String nome;
       char sexo;
       int idade;
       
       nome=JOptionPane.showInputDialog("Digite o nome: ");
       sexo=JOptionPane.showInputDialog("Digite o sexo (m/f): ").charAt(0);
       idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
       Pessoa p = new Pessoa(nome,sexo,idade);
       return p;
    }
    
    public static Formacao leFormacao(){
       String nivel, instituicao;
       char resp;
       boolean concluido;
       int ano;
       
       nivel=JOptionPane.showInputDialog("Digite o nível de escolaridade: ");
       instituicao=JOptionPane.showInputDialog("Digite a instituição: ");
       resp=JOptionPane.showInputDialog("Já concluiu? (s/n)").charAt(0);
       if(resp=='s'||resp=='S')
           concluido=true;
       else
           concluido=false;
       ano=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
       Formacao f = new Formacao(nivel,instituicao,concluido,ano);
       return f;
    }
    
    public static String exibeFormacao(Formacao f){
        if(f.concluido)
             return "        FORMAÇÃO\nEscolaridade: "+f.nivel+"\nInstituição: "+f.instituicao+"\nConcluído: SIM\nANO: "+f.ano;
        return "        FORMAÇÃO\nEscolaridade: "+f.nivel+"\nInstituição: "+f.instituicao+"\nConcluído: NÃO\nANO: "+f.ano;
    }
    
    public static String exibePessoa(Pessoa p){
        return "        CADASTRO\nNOME: "+p.nome+"\nSEXO: "+p.sexo+"\nIDADE: "+p.idade;
    }

    
    public static void main(String[] args) {
        int op;
        //Pessoa p1 = new Pessoa(" ",' ',0);
        //Formacao f1 = new Formacao(" "," ",true,0);
        Pessoa p1 = null;
        Formacao f1 = null;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("    M E N U\n\n1- Cadastrar Pessoa\n2- Cadastrar Formação\n3- Exibir\n4- Alterar Idade\n5- SAIR\n\nEscolha uma opção: "));
            switch(op){
                case 1: p1 = lePessoa();
                        break;
                case 2: f1 = leFormacao();
                        break;
                case 3: if(p1!=null)
                          if(f1!=null)
                              JOptionPane.showMessageDialog(null,exibePessoa(p1)+"\n\n"+ exibeFormacao(f1),"SAIDA",1);
                          else
                              JOptionPane.showMessageDialog(null,"NÃO HÁ CADASTRO DE FORMAÇÃO","SAIDA",2);
                        else
                           JOptionPane.showMessageDialog(null,"NÃO HÁ CADASTRO DE PESSOA","SAIDA",2);
                        break;
                case 4: if(p1!=null)
                          if(f1!=null)
                              p1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova idade:"));            
                          else
                              JOptionPane.showMessageDialog(null,"NÃO HÁ CADASTRO DE FORMAÇÃO","SAIDA",2);
                        else
                           JOptionPane.showMessageDialog(null,"NÃO HÁ CADASTRO DE PESSOA","SAIDA",2);
            }
        }while(op!=5);        
    }
    
}
