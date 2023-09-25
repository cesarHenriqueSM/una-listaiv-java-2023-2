package lista4;
import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
			int i = 1;
			float num1, num2, num3, num4, num5;
		
			System.out.printf("Informe o %d° número: ", i++);
				num1 = read.nextFloat();
			System.out.printf("Informe o %d° número: ", i++);
				num2 = read.nextFloat();
			System.out.printf("Informe o %d° número: ", i++);
				num3 = read.nextFloat();
			System.out.printf("Informe o %d° número: ", i++);
				num4 = read.nextFloat();
			System.out.printf("Informe o %d° número: ", i++);
				num5 = read.nextFloat();
				
			float soma = num1 + num2 + num3 + num4 + num5;
			float media = soma/5;
			
			System.out.printf("A soma dos números informados é igual a %.1f, e a média equivale a %.2f.", soma, media);

	}
}
