# César Henrique Soares Marques - RA 622120352
## UNA Lista IV - 2023/2

### 1 - Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

'''

package lista4;
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

'''

### 2 - Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

'''

package lista4;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
			System.out.print("Informe seu usuário: ");
				String usuario = read.nextLine();
			System.out.print("Informe sua senha: ");
				String senha = read.nextLine();
				
			while(usuario .equals(senha)) {
				System.out.println("Erro! Usuário e senha não podem ser iguais!");
				System.out.print("Usuário: ");
					usuario = read.nextLine();
				System.out.print("Senha: ");
					senha = read.nextLine();
			}
			System.out.print("Programa finalizado!");
	}
}

'''


### 3 - Faça um programa que leia e valide as seguintes informações:

Nome: maior que 3 caracteres;

Idade: entre 0 e 150;

Salário: maior que zero;

Sexo: 'f' ou 'm';

Estado Civil: 's', 'c', 'v', 'd'; 

''' 

package lista4;
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
				System.out.print("ERRO! Informe seu estado civil usando s = solteiro(a); c = casado(a); v = viúvo(a); d = divorciado(a): ");
					estado_civil = read.next();
					estado_civil.toLowerCase();
			}
		System.out.print("Fim do programa!");
	}
}

'''

### 4 - Faça um programa que leia 5 números e informe a soma e a média dos números.

''' 

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

'''

### 5 - Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

''' 

package lista4;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int i = 1;
		
		for (i = 1; i<=50; i++) {
			if (i % 2 == 1) {
				System.out.print(i+"\n");
			}
		}
	}

}

'''

### 6 - Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles. 

'''

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

'''

### 7 - Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.

'''

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

'''
