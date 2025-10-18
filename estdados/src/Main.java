import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("AULA PARA ALGORITMOS DE ORDENACAO AIIAIAIIIIIIII AIIIIIIIIIIIIIIII AAAAAAAAAAAAAAAA");
        int[] valores = {5, 2, 10, 12, 9, 20, 25, 34, 32, 47, 45, 50, 40};
        int[] valores2 = {5, 2, 10, 12, 9, 20, 25, 34, 32, 47, 45, 50, 40};
        ordenacao teste = new ordenacao(valores);
        ordenacao teste2 = new ordenacao(valores2);

        System.out.println("======================TESTE COM BUBBLE SORT=============================");

        teste.bubbleSort(13, valores);

        System.out.println("========================================================================");

        System.out.println("======================TESTE COM SELECTION SORT=============================");

        teste2.selectionSort(13, valores2);

        System.out.println("===========================================================================");





        System.out.println("acabo :D");
    }
}

class ordenacao {

    private int[] vetor;

    public ordenacao (int[] vetor) {
      this.vetor = vetor;
    }

    public void bubbleSort(int tamanho, int[] vetor) {
        int temp = 0;
        int trocas = 0;


        //primeiro for para etapas
        //Adicionar uma condicao de parada
        for(int i = 0; i<tamanho; i++) {
            int trocou = 0;

            for(int j = 1; j<tamanho - i; j++) {
                //Se a posição anterior for maior que a atual..
                if (vetor[j - 1] > vetor[j]) {
                    //realize troca elementos
                    temp = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = temp;
                    trocas++;
                    trocou ++;
                }

            }

            if (trocou == 0){
                System.out.println("Nao houve mais trocas de posicoes, ou seja, o vetor está ordenado");
                break;
            }
        }

        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor) + " trocas feitas: " + trocas);
    }

    public void selectionSort(int tamanho, int[] vetor){
        int trocas = 0;
        for(int i=0; i < tamanho - 1; i++){
            int minIndex = i;
            for(int j= i + 1; j < tamanho; j++){
                if(vetor[j] < vetor[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
                trocas++;
            }
        }

        System.out.println("Ordenacao feita!! :D Aqui esta sua lista: " + Arrays.toString(vetor) + " trocas feitas: " + trocas);
    }

    public void cocktailSort(int tamanho, int[] vetor) {
        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temp;
        int trocas = 0;

        while(trocou) {
            trocou = false;

            //passagem da esquerda para  direita
            for(int i = inicio; i < fim; i++){
                if(vetor[i] > vetor [i + 1]){
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                    trocas++;
                }

            }

            if (!trocou) {
                break;
            }

            trocou = false;
            fim  ;

            for(int i = fim; i > inicio; i--){
                if(vetor[i] < vetor[i - 1]){
                    temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                    trocou = true;
                    trocas++;
                }
            }

            inicio++;

        }
        System.out.println("Ordenacao pronta: " + Arrays.toString(vetor) + " Trocas: " + trocas);
    }

}