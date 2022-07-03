package proa;
import java.util.Scanner;

public class Exercicio_7 {

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
		int somaMaiores;
		
		if (num1 > num2 && num1 > num3) {
			maiorNum = num1;
		} else if (num2 > num1 && num2 > num3) {
			maiorNum = num2;
		} else {
			maiorNum = num3;
		};
		
		if (num1 <= maiorNum && num1 > num2 || num1 > num3) {
			somaMaiores = num1 + maiorNum;
			System.out.println("A soma dos dois maiores números é: " + somaMaiores);
		} else if(num2 <= maiorNum && num2 > num1 || num2 > num3) {
			somaMaiores = num2 + maiorNum;
			System.out.println("A soma dos dois maiores números é: " + somaMaiores);
		} else if(num3 <= maiorNum && num3 > num1 || num3 > num2) {
			somaMaiores = num3 + maiorNum;
			System.out.println("A soma dos dois maiores números é: " + somaMaiores);
		} else {
			System.out.println("Operação Inválida!");
		}
		
		num1Input.close();
		num2Input.close();
		num3Input.close();
	}

}
