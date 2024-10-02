package Exercicios.Atividade_avaliativa_01;

import java.util.Scanner;

public class JogoVelha {
    public static char mAtual[][] = new char[3][3];
    public static int mPosicao[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

    public static void main(String[] args) {
        int posicao;
        int jogador = 1;
        char chr = 'x';
        boolean fim = false;
        while (!fim) {
            posicao = interFace(jogador);
            while (!validacao(posicao)) {
                restricao();
                posicao = interFace(jogador);
            }

            if(jogador == 1){
                chr = 'x';
            }else{
                chr = 'o';
            }

            switch (posicao) {
                case 1:
                    mAtual[0][0] = chr;
                    break;
                case 2:
                    mAtual[0][1] = chr;
                    break;
                case 3:
                    mAtual[0][2] = chr;
                    break;
                case 4:
                    mAtual[1][0] = chr;
                    break;
                case 5:
                    mAtual[1][1] =chr;
                        
                    break;
                case 6:
                    mAtual[1][2] =chr;
                        
                    break;
                case 7:
                    mAtual[2][0] =chr;
                        
                    break;
                case 8:
                    mAtual[2][1] =chr;
                        
                    break;
                case 9:
                    mAtual[2][2] =chr;
                    break;
                default:                
                    break;

        }

        if(vitoria()||empate()){
            //System.out.println("log_fim");
            fim = true;
        }

        if(!fim)
        if (jogador == 1)
            jogador = 2;
        else
            jogador = 1;
    }
    exibeFim(jogador);
}

    public static int interFace(int jogador) {
        Scanner s = new Scanner(System.in);
        System.out.println("Tabuleiro atual:");

        for (int i = 0; i < mAtual.length; i++) {
            for (int j = 0; j < mAtual[i].length; j++) {
                System.out.print(mAtual[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mPosicao.length; i++) {
            for (int j = 0; j < mPosicao[i].length; j++) {
                System.out.print(mPosicao[i][j]);
            }
            System.out.println();
        }

        System.out.println("Jogador " + jogador + " é a sua vez de jogar!");
        System.out.print("Escolha uma posição:");
        int posicao = s.nextInt();
        System.out.println();
        //s.close();

        return posicao;
    }

    public static boolean validacao(int posicao) {
        
        if (posicao < 1 || posicao > 9) {
            return false;
        } else {
            switch (posicao) {
                case 1:
                    if (mAtual[0][0] != '\u0000')
                        return false;
                    break;
                case 2:
                    if (mAtual[0][1] != '\u0000')
                        return false;
                    break;
                case 3:
                    if (mAtual[0][2] != '\u0000')
                        return false;
                    break;
                case 4:
                    if (mAtual[1][0] != '\u0000')
                        return false;
                    break;
                case 5:
                    if (mAtual[1][1] != '\u0000')
                        return false;
                    break;
                case 6:
                    if (mAtual[1][2] != '\u0000')
                        return false;
                    break;
                case 7:
                    if (mAtual[2][0] != '\u0000')
                        return false;
                    break;
                case 8:
                    if (mAtual[2][1] != '\u0000')
                        return false;
                    break;
                case 9:
                    if (mAtual[2][2] != '\u0000')
                        return false;
                    break;
                default:                
                    break;
            }
            return true;
            // for (int i = 0; i < mPosicao.length; i++) {
            // for (int j = 0; j < mPosicao[i].length; j++) {
            // if (mPosicao[i][j]==posicao) {
            // if(mAtual[i][j] == '\u0000')
            // retorno = true;
            // else
            // retorno = false;
            // }
            // }
            // }
        }
    }

    public static void restricao() {
        System.out.println("Jogada inválida!!!");
        System.out.println();
    }

    public static boolean empate() {
       // Se houver uma vitória, não pode ser empate
       if (vitoria()) {
        return false;
    }

    // Verifica se todas as células estão preenchidas
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (mAtual[i][j] == '\u0000') {
                return false; // Se houver uma célula vazia, não é empate
            }
        }
    }

    // Se não há células vazias e ninguém venceu, é empate
    return true;
    }

    public static boolean vitoria() {
         // Verifica as linhas
         for (int i = 0; i < 3; i++) {
            if (mAtual[i][0] == mAtual[i][1] && mAtual[i][1] == mAtual[i][2] && mAtual[i][0] != '\u0000') {
                return true;
            }
        }
        
        // Verifica as colunas
        for (int i = 0; i < 3; i++) {
            if (mAtual[0][i] == mAtual[1][i] && mAtual[1][i] == mAtual[2][i] && mAtual[0][i] != '\u0000') {
                return true;
            }
        }
        
        // Verifica a diagonal principal
        if (mAtual[0][0] == mAtual[1][1] && mAtual[1][1] == mAtual[2][2] && mAtual[0][0] != '\u0000') {
            return true;
        }
        
        // Verifica a diagonal secundária
        if (mAtual[0][2] == mAtual[1][1] && mAtual[1][1] == mAtual[2][0] && mAtual[0][2] != '\u0000') {
            return true;
        }
        
        // Caso não haja vitória
        return false;
    }

    public static void exibeFim(int jogador){
        if(vitoria()){
            System.out.println("Jogador "+jogador+" foi o vencedor");
            for (int i = 0; i < mAtual.length; i++) {
                for (int j = 0; j < mAtual[i].length; j++) {
                    System.out.print(" "+mAtual[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Deu velha!");
        }
    }
}
