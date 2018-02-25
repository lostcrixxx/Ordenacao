public class BubbleSort {

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
		bubblesort(vetor);
		// Organizado crescente
		imprime(vetor);
    }

    public static void bubblesort(int[] array){
    	int aux = 0;
    	// Ultima posicao
		for(int ultimo = array.length-1; ultimo > 0; ultimo--){
			// Posição
			System.out.println("Pega a posição");
			for(int i = 0; i < ultimo; i++){
				// Exibindo na tela o que será comparado
				System.out.println(array[i] + " é maior que " + array[i+1] + " ?");
				// Comparando uma posição com a próxima
				if(array[i] > array[i+1]){
					// Mudando de posição
					aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
				}
    		}	
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
