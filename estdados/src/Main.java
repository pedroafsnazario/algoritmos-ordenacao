import java.util.Arrays;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("AULA PARA ALGORITMOS DE ORDENACAO");

        //int[] vetor1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        //int[] vetor2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        //int[] vetor3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        int[] valores = {5, 2, 10, 12, 9, 20, 25, 34, 32, 47, 45, 50, 40};
        int[] valores2 = {5, 2, 10, 12, 9, 20, 25, 34, 32, 47, 45, 50, 40};
        int[] valores3 = {5, 2, 10, 12, 9, 20, 25, 34, 32, 47, 45, 50, 40};
        int[] valores4 = {5, 2, 10, 12, 9, 20, 25, 34, 32, 47, 45, 50, 40};
        int[] valores5 = {5, 2, 10, 12, 9, 20, 25, 34, 32, 47, 45, 50, 40};
        int[] valores6 = {5, 2, 10, 12, 9, 20, 25, 34, 32, 47, 45, 50, 40};
        ordenacao teste = new ordenacao(valores);
        ordenacao teste2 = new ordenacao(valores2);
        ordenacao teste3 = new ordenacao(valores3);
        ordenacao teste4 = new ordenacao(valores4);
        ordenacao teste5 = new ordenacao(valores5);
        ordenacao teste6 = new ordenacao(valores6);

        System.out.println("======================TESTE COM BUBBLE SORT=============================");

        teste.bubbleSort(13, valores);

        System.out.println("========================================================================");

        System.out.println("  ");

        System.out.println("======================TESTE COM SELECTION SORT=============================");

        teste2.selectionSort(13, valores2);

        System.out.println("===========================================================================");

        System.out.println("  ");

        System.out.println("======================TESTE COM COCKTAIL SORT=============================");

        teste3.cocktailSort(13, valores3);

        System.out.println("===========================================================================");

        System.out.println("  ");

        System.out.println("======================TESTE COM GNOME SORT=================================");

        teste4.gnomeSort(13, valores4);

        System.out.println("===========================================================================");

        System.out.println("  ");

        System.out.println("======================TESTE COM COMB SORT=================================");

        teste5.combSort(13, valores5);

        System.out.println("===========================================================================");

        System.out.println("  ");

        System.out.println("======================TESTE COM BUCKET SORT=================================");

        teste6.bucketSort(13, valores6);

        System.out.println("============================================================================");

        System.out.println("  ");


        System.out.println("Fim dos testes.");
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
        int interacoes = 0;


        //primeiro for para etapas
        //Adicionar uma condicao de parada
        for(int i = 0; i<tamanho; i++) {
            int trocou = 0;
            interacoes++;

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

        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor) + " trocas feitas: " + trocas + ", Interacoes feitas: " + interacoes);
    }

    public void selectionSort(int tamanho, int[] vetor){
        int trocas = 0;
        int interacoes = 0;
        for(int i=0; i < tamanho - 1; i++){
            interacoes++;
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

        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor) + " trocas feitas: " + trocas + ", Interacoes feitas: " + interacoes);
    }

    public void cocktailSort(int tamanho, int[] vetor) {
        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temp;
        int trocas = 0;
        int interacoes = 0;

        while(trocou) {
            trocou = false;

            //passagem da esquerda para  direita
            for(int i = inicio; i < fim; i++){
                interacoes++;
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
            fim-- ;

            for(int i = fim; i > inicio; i--){
                interacoes++;
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
        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor) + " trocas feitas: " + trocas + ", Interacoes feitas: " + interacoes);
    }

    public void gnomeSort(int tamanho, int[] vetor){
        int i = 0;
        int trocas = 0;
        int interacoes = 0;

        while (i < tamanho) {
            interacoes++;
            if (i == 0 || vetor[i-1] <= vetor[i]) {
                i++;
            }
            else {
                int temp = vetor[i]; 
                vetor[i] = vetor[i-1]; 
                vetor[--i] = temp;
                trocas++;
            }
        }

        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor) + " trocas feitas: " + trocas + ", Interacoes feitas: " + interacoes);
    }

    public void bucketSort(int tamanho, int[] vetor){
        int trocas = 0;
        int interacoes = 0;

        if (tamanho <= 0)
            return;

        //Encontrar o valor máximo e mínimo
        int min = vetor[0];
        int max = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            interacoes++;
            if (vetor[i] < min) min = vetor[i];
            if (vetor[i] > max) max = vetor[i];
        }

        //Definir número de "baldes"
        int numBuckets = (int) Math.sqrt(tamanho);
        int[][] buckets = new int[numBuckets][tamanho];
        int[] bucketCount = new int[numBuckets];

        //Colocar elementos nos buckets
        double intervalo = ((double)(max - min + 1)) / numBuckets;
        for (int i = 0; i < tamanho; i++) {
            interacoes++;
            int idx = (int) ((vetor[i] - min) / intervalo);
            if (idx >= numBuckets) idx = numBuckets - 1;
            buckets[idx][bucketCount[idx]++] = vetor[i];
        }

        //Ordenar cada bucket (Insertion Sort)
        int k = 0;
        for (int b = 0; b < numBuckets; b++) {
            for (int i = 1; i < bucketCount[b]; i++) {
                int chave = buckets[b][i];
                int j = i - 1;
                while (j >= 0 && buckets[b][j] > chave) {
                    interacoes++;
                    buckets[b][j + 1] = buckets[b][j];
                    trocas++;
                    j--;
                }
                buckets[b][j + 1] = chave;
            }

            //Copiar de volta para o vetor original
            for (int i = 0; i < bucketCount[b]; i++) {
                vetor[k++] = buckets[b][i];
            }
        }

        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor) + " trocas feitas: " + trocas + ", Interacoes feitas: " + interacoes);
    }

    public void combSort(int tamanho, int[] vetor){
        int n = tamanho;
        int gap = n;
        boolean sorted = false;
        int trocas = 0;
        int interacoes = 0;

        while (!sorted) {
            
            gap = (int) (gap / 1.3);
            if (gap <= 1){
                gap = 1;
                sorted = true;
            } 

            for (int i = 0; i < n - gap; i++) {
                interacoes++; 

                if (vetor[i] > vetor[i + gap]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + gap];
                    vetor[i + gap] = temp;
                    trocas++;      
                    sorted = false; 
                }
            }
        }

        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor) + " trocas feitas: " + trocas + ", Interacoes feitas: " + interacoes);
    }

}

