package listaiv;

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