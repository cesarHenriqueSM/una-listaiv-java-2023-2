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