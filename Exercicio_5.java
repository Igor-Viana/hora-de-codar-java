package proa;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um Número: ");
		int intInput = input.nextInt();
		
		if (intInput > 0) {
			System.out.println("O número " + intInput + " é Positivo!");
		} else if(intInput == 0) {
			System.out.println("O número " + intInput + " é igual a Zero!");
		} else if(intInput < 0) {
			System.out.println("O número " + intInput + " é Negativo!");
		} else {
			System.out.println("Valor Inválido!");
		}
		
		input.close();
	}

}
