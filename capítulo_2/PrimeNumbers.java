import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	
	//variable miembro como List para elegir la implementación concreta
	private List<Integer> primes;
	
	//si el argumento módulo todos los números desde dos al número en cuestión
	//dá resto cero, es primo 
	private Boolean isPrime(Integer testNumber) {
		for (int i = 2; i < testNumber; i++) {
			if (testNumber % i == 0) return false;
		}
		return true;
	}
	
	//lógica para generar el número siguiente
	//llama fn auxiliar esPrimo()
	private Integer getNextPrimeAbove(Integer previous) {
		Integer testNumber = previous + 1;
		while (!isPrime(testNumber)) {
			testNumber++;
		}
		return testNumber;
	}
	
	//instancia lista miembro, con n elementos (n ingresado por consola)
	//llama fn auxiliar para generar el siguiente
	public void generateNumbers (Integer max) {
		primes = new ArrayList<Integer>();
		primes.add(2);

		Integer next = 2;
		while (primes.size() <= max) {
			next = getNextPrimeAbove(next);
			primes.add(next);
		}
		System.out.println(primes);
	}

}
