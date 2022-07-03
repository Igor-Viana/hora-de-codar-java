package proa;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner lerNome = new Scanner(System.in);
		System.out.println("Informe Seu Nome: ");
		String nome = lerNome.nextLine();
		
		Scanner lerIdade = new Scanner(System.in);
		System.out.println("Informe Sua Idade: ");
		String idade = lerIdade.nextLine();

		System.out.println("Olá, " + nome + " , sua idade é: " + idade);
		lerNome.close();
		lerIdade.close();
	}

}
