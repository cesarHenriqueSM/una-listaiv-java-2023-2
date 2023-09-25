package lista4;
import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
			int num1 = read.nextInt();
		System.out.print("Informe o segundo número: ");
			int num2 = read.nextInt();
			
		if (num1 > num2) {
			for (num2++; num2 < num1; num2++) {
				System.out.print(num2+"\n");
			}
		}
		else if(num2 > num1){
			for (num1++; num1 < num2; num1++) {
				System.out.print(num1+"\n");
			}
		}
		else {
			System.out.print("ERRO! Os 2 números informados são iguais.");	
			}
	}

}