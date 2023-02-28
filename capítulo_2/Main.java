import java.util.Date;

public class Main {
	
	//el método principal se encarga de recibir un argumento por consola
	//que es la cantidad(de primos) para que muestre el algoritmo
	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
	}

}
