/**
 * 
 */
package proa;
import java.util.Scanner;

/**
 * @author Igor
 *
 */
public class Exercicio_2 {

	public static void main(String[] args) {
		//Ler o input "nome" do usuario e exibir a mensagem de boas vindas na tela 
		System.out.println("Digite seu nome e será exibido uma mensagem de boas vindas");
		Scanner lerInput = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
					
		String nome = lerInput.nextLine();
		System.out.println("Olá, " + nome + " Prazer em te conhecer!");
		lerInput.close();
	}

}
