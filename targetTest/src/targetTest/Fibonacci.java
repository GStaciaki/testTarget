package targetTest;

public class Fibonacci {

	public static void verificaSePertenceAFibonacci(int i) {

		int nAnterior = 0, nAtual = 1;
		
		if (i == 0 ) {
			System.out.println("Pertence a sequencia Fibonacci");
			return;
		}

		while (nAtual <= i) {
			
			if (nAtual == i) {
				System.out.println("Pertence a sequencia Fibonacci");
				return;
			}
			
			nAtual += nAnterior;
			nAnterior = nAtual - nAnterior;
		}

		System.out.println("Nao pertence a sequencia Fibonacci");

	}
}
