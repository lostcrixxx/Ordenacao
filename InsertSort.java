public class InsertSort {

    public static void main(String[] args) {

		// Vetor
		int[] vetor = new int[10];

		// Preencher vetor
		for(int i = 0; i < vetor.length; i++){
			// Número aleatórios de 1 a 100
			vetor[i] = (int)(Math.random() * 100 +1);
		}
		
		// Vetor original
		imprime(vetor);
		// Ordenação
		insertSort(vetor);
		// Organizado crescente
		imprime(vetor);
    }

    public static void insertSort(int[] array){
    	int aux = 0;
    	int x, j;
		for(int i = 0; i < array.length; i++){
			x = array[i];
			j = i - 1;
			while((j >= 0) && array[j] > x){
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = x;
		}
    }

    public static void imprime(int[] array){
    	String s = "v:[";
    	for(int i = 0; i < array.length; i++){
    		s += array[i] + ", ";
    	}
		System.out.println(s+ "]");
    }
}
