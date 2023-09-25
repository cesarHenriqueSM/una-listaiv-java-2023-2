package lista4;
import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
			int soma = 0;
		
			for (int i = 1; i <= 5; i++) {
				System.out.printf("Informe o %d° número: ", i);
					int num = read.nextInt();
				soma = soma + num;
			}
			
			float media = soma/5;
			
			System.out.printf("A soma dos números informados é igual a %d, e a média equivale a %.2f.", soma, media);

	}
}
