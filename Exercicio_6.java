package proa;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner num1Input = new Scanner(System.in);
		System.out.println("Digite o Primeiro número: ");
		int num1 = num1Input.nextInt();
		
		Scanner num2Input = new Scanner(System.in);
		System.out.println("Digite o Segundo número: ");
		int num2 = num2Input.nextInt();
		
		Scanner num3Input = new Scanner(System.in);
		System.out.println("Digite o Terceiro Número: ");
		int num3 = num3Input.nextInt();
		
		int maiorNum;
		
		if (num1 > num2 && num1 > num3) {
			maiorNum = num1;
		} else if (num2 > num1 && num2 > num3) {
			maiorNum = num2;
		} else {
			maiorNum = num3;
		};
		
		System.out.println("O maior número é: " + maiorNum);
		
		num1Input.close();
		num2Input.close();
		num3Input.close();
	}

}
