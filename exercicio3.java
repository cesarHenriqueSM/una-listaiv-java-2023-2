package listaiv;

import java.util.Scanner;
public class exercicio3 {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
			String nome = read.next();
			while(nome.length() < 3) {
				System.out.print("ERRO! Seu nome deve conter mais de 3 caracteres: ");
					nome = read.next();
			}
		System.out.print("Informe sua idade: ");
			int idade = read.nextInt();
			while(idade < 0 || idade > 150) {
				System.out.print("ERRO! Sua idade deve estar entre 0 e 150: ");
					idade = read.nextInt();
			}
		System.out.print("Informe seu salário: ");
			double salario = read.nextDouble();
			while(salario < 0) {
				System.out.print("ERRO! Informe um salário maior que 0: ");
					salario = read.nextDouble();
			}
		System.out.print("Informe seu gênero (f ou m): ");
			String sexo = read.next();
			sexo.toLowerCase();
			while(!sexo.equals("f") && !sexo.equals("m")) {
				System.out.print("ERRO! Informe seu gênero usando f (feminino) ou m (masculino): ");
					sexo = read.next();
					sexo.toLowerCase();
			}
		System.out.print("Informe seu estado civil (s = solteiro(a); c = casado(a); v = viúvo(a); d = divorciado(a): ");
			String estado_civil = read.next();
			estado_civil.toLowerCase();
			while(!estado_civil.equals("s") && !estado_civil.equals("c") && !estado_civil.equals("v") && !estado_civil.equals("s") && !estado_civil.equals("d")) {
				System.out.print("ERRO! Informe seu estado civil usando f (feminino) ou m (masculino): ");
					estado_civil = read.next();
					estado_civil.toLowerCase();
			}
		System.out.print("Fim do programa!");
	}
}