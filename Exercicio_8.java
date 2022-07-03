package proa;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner num1Input = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = num1Input.nextInt();
		
		int num2 = 0;
		
		while (num2 <=0) {
			Scanner num2Input = new Scanner(System.in);
			System.out.println("Digite o segundo número: ");
			num2 = num2Input.nextInt();
		}
		
		System.out.println("O resultado da divisão do primeiro número pelo segundo é: " + num1/num2);

	}

}
