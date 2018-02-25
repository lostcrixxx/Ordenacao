public class SelectionSort {

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
		selectionSort(vetor);
		// Organizado crescente
		imprime(vetor);
    }

    public static void selectionSort(int[] array){
    	int aux = 0;
    	// Ultima posicao
		for(int x = 0; x < array.length; x++){
			int menor = x;
			for(int i = x+1; i < array.length; i++){
				if(array[i] < array[menor]){
					menor = i;
				}
    		}
    		aux = array[x];
			array[x] = array[menor];
			array[menor] = aux;
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
