import java.util.Arrays;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("TDE3 - Testes de desempenho - Algoritmos de Ordenação");

        
        //Vetor 1 
        int[] b1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] s1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] c1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] cmb1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] g1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};
        int[] bckt1= {12, 18, 9, 25, 17, 31, 22, 27, 16, 13, 19, 23, 20, 30, 14, 11, 15, 24, 26, 28};

        //Vetor 2
        int[] b2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] s2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] c2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] cmb2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] g2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};
        int[] bckt2 = {5, 7, 9, 10, 12, 14, 15, 17, 19, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32};


        //Vetor 3
        int[] b3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] s3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] c3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] cmb3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] g3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};
        int[] bckt3 = {99, 85, 73, 60, 50, 40, 35, 30, 25, 20, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6};

        ordenacao b = new ordenacao(b1);
        ordenacao s = new ordenacao(s1);
        ordenacao c = new ordenacao(c1);
        ordenacao cmb = new ordenacao(cmb1);
        ordenacao g = new ordenacao(g1);
        ordenacao bckt = new ordenacao(bckt1);

        System.out.println("Teste número 1 - Vetor de tamanho 20 com valores aleatórios entre 9 e 31");

        System.out.println("Bubble Sort:");
        b.bubbleSort(b1.length, b1);

        System.out.println("Selection Sort:");
        s.selectionSort(s1.length, s1);

        System.out.println("Cocktail Sort:");
        c.cocktailSort(c1.length, c1);

        System.out.println("Comb Sort:");
        cmb.combSort(cmb1.length, cmb1);

        System.out.println("Gnome Sort:");
        g.gnomeSort(g1.length, g1);

        System.out.println("Bucket Sort:");
        bckt.bucketSort(bckt1.length, bckt1);

        System.out.println("-------------------------------");

        System.out.println("Teste número 2 - Vetor de tamanho 20 já ordenado");

        System.out.println("Bubble Sort:");
        b.bubbleSort(b2.length, b2);

        System.out.println("Selection Sort:");
        s.selectionSort(s2.length, s2);

        System.out.println("Cocktail Sort:");
        c.cocktailSort(c2.length, c2);

        System.out.println("Comb Sort:");
        cmb.combSort(cmb2.length, cmb2);

        System.out.println("Gnome Sort:");
        g.gnomeSort(g2.length, g2);

        System.out.println("Bucket Sort:");
        bckt.bucketSort(bckt2.length, bckt2);

        System.out.println("-------------------------------");

        System.out.println("Teste número 3 - Vetor de tamanho 20 ordenado em ordem decrescente");

        System.out.println("Bubble Sort:");
        b.bubbleSort(b3.length, b3);

        System.out.println("Selection Sort:");
        s.selectionSort(s3.length, s3);

        System.out.println("Cocktail Sort:");
        c.cocktailSort(c3.length, c3);

        System.out.println("Comb Sort:");
        cmb.combSort(cmb3.length, cmb3);

        System.out.println("Gnome Sort:");
        g.gnomeSort(g3.length, g3);

        System.out.println("Bucket Sort:");
        bckt.bucketSort(bckt3.length, bckt3);


        System.out.println("-------------------------------");


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

