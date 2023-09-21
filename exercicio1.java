package listaiv;

import java.util.Scanner;
public class exercicio1 {
	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
			System.out.print("Digite uma nota entre 0 e 10: ");
				double nota = read.nextDouble();
	
			while(nota < 0 || nota > 10) {
				System.out.print("ERRO! Nota inválida. Informe uma nota entre 0 e 10: ");
					nota = read.nextDouble();
		}
		
		System.out.print("Programa finalizado!");
	}
}