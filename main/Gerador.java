package main;
import java.util.Stack;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Gerador {

    public static void main(String[] args) {
        
        int[] tamanhoLabirinto = {4,4};
        Coordenadas casaAtual = new Coordenadas(0, 0); //Debugging
        //System.out.println(escolherCasa(casaAtual, tamanhoLabirinto));

        gerarCaminho(tamanhoLabirinto);
    }

    public static int[] gerarCaminho(int[] tamanhoLabirinto){

        Stack<Coordenadas> caminho = new Stack<>();
        int casasVerificadas = 0;

        //Ponto inicial
        Coordenadas casaAtual = new Coordenadas(0, 0); 

        while (casasVerificadas != tamanhoLabirinto[0]*tamanhoLabirinto[1]) {
            
            Coordenadas proximaCasa;

            HashMap<Character, Boolean> casasPossiveis = escolherCasa(casaAtual, tamanhoLabirinto);
            
            for (Map.Entry<Character, Boolean> entry : casasPossiveis.entrySet()) {
                if (entry.getValue()) {  
                    System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
                }
            

        }

        int[] placeholder = {0,0};
        return placeholder;
    }

    public static HashMap<Character, Boolean> escolherCasa(Coordenadas coordenadas, int[] tamanhoLabirinto){

        HashMap<Character, Boolean> casasPossiveis = new HashMap<>();

        casasPossiveis.put('N', coordenadas.getY() - 1 >= 0);
        casasPossiveis.put('S', coordenadas.getY() + 1 >= 0);
        casasPossiveis.put('E', coordenadas.getX() - 1 >= 0);
        casasPossiveis.put('O', coordenadas.getX() + 1 >= 0);


        //TODO: confirmar se a casa ainda não foi utilizada
        return casasPossiveis;
    }
}