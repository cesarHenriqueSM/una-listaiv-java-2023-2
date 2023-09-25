package lista4;
import java.util.Scanner;

public class exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num_pares = 0, num_impares = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Informe o %d° número: ", i);
				int num = read.nextInt();
			if (num % 2 == 0) {
				num_pares++;
			}
			else {
				num_impares++;
			}
		}
		
		System.out.printf("Você digitou %d números pares e %d números ímpares.", num_pares, num_impares);
		
	}

}
