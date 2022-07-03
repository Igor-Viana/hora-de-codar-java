package proa;
import java.util.Scanner;

public class Exercicio_4 {
	/*public int altura;
	public int base;
	public int base_menor;
	public int largura;
	*/
	public static void main(String[] args) {
		Scanner escolherForma = new Scanner(System.in);
		System.out.println("Escolha a forma da qual será realizado o cálculo: " + "\n" + "[ 1 ] Retangulo;" + "\n" + "[ 2 ] Quadrado;" + "\n" + "[ 3 ] Losango;" + "\n" + "[ 4 ] Trapezio;" + "\n" + "[ 5 ] Paralelogramo;" + "\n" + "[ 6 ] Triangulo;" + "\n" + "[ 7 ] Circulo;");
		int escolha = escolherForma.nextInt();
		
		switch(escolha) {
		case 1: 
			Scanner baseRetanguloInput = new Scanner(System.in);
			System.out.println("Informe o valor da base do retangulo: ");
			int baseRetangulo = baseRetanguloInput.nextInt();
			Scanner alturaRetanguloInput = new Scanner(System.in);
			System.out.println("Informe o valor da altura do retangulo: ");
			int alturaRetangulo = alturaRetanguloInput.nextInt();
			
			int calculoRetangulo = baseRetangulo*alturaRetangulo;
			System.out.println("A area do retâgulo e: " + calculoRetangulo);
			
			baseRetanguloInput.close();
			alturaRetanguloInput.close();
			break;
		case 2:
			Scanner ladoQuadradoInput = new Scanner(System.in);
			System.out.println("Digite o valor de algum dos lados do quadrado: ");
			int ladoQuadrado = ladoQuadradoInput.nextInt();
			
			System.out.println("A area do quadrado e: " + ladoQuadrado*ladoQuadrado);
			
			ladoQuadradoInput.close();
			break;
		case 3:
			Scanner diagonalMaiorLosangoInput = new Scanner(System.in);
			System.out.println("Digite o valor da maior diagonal do losango: ");
			int diagonalMaiorLosango = diagonalMaiorLosangoInput.nextInt();
			Scanner diagonalMenorLosangoInput = new Scanner(System.in);
			System.out.println("Digite o valor da menor diagonal do losango: ");
			int diagonalMenorLosango = diagonalMenorLosangoInput.nextInt();
			
			int calculoLosango = diagonalMaiorLosango*diagonalMenorLosango/2;
			
			System.out.println("A area do losango é: " + calculoLosango);
			
			diagonalMaiorLosangoInput.close();
			diagonalMenorLosangoInput.close();
			break;
		case 4:
			Scanner baseMaiorTrapezioInput = new Scanner(System.in);
			System.out.println("Informe o valor da base maior do trapezio: ");
			int baseMaiorTrapezio = baseMaiorTrapezioInput.nextInt();
			
			Scanner baseMenorTrapezioInput = new Scanner(System.in);
			System.out.println("Informe o valor da menor base do trapezio: ");
			int baseMenorTrapezio = baseMenorTrapezioInput.nextInt();
			
			Scanner alturaTrapezioInput = new Scanner(System.in);
			System.out.println("Informe a Altura do trapezio: ");
			int alturaTrapezio = alturaTrapezioInput.nextInt();
			
			int somaBases = baseMaiorTrapezio + baseMenorTrapezio;
			System.out.println("A área do Trapezio é: " + somaBases*alturaTrapezio/2);
			baseMaiorTrapezioInput.close();
			baseMenorTrapezioInput.close();
			alturaTrapezioInput.close();
			break;
		case 5:
			Scanner baseParalelogramoInput = new Scanner(System.in);
			System.out.println("Informe a base do paralelogramo: ");
			int baseParalelogramo = baseParalelogramoInput.nextInt();
			
			Scanner alturaParalelogramoInput = new Scanner(System.in);
			System.out.println("Informe a Altura do Paralelogramo: ");
			int alturaParalelogramo = alturaParalelogramoInput.nextInt();
			
			System.out.println("A área do paralelogramo é: " + baseParalelogramo*alturaParalelogramo);
			
			baseParalelogramoInput.close();
			alturaParalelogramoInput.close();
			break;
		case 6:
			Scanner baseTrianguloInput = new Scanner(System.in);
			System.out.println("Informe a base do triangulo: ");
			int baseTriangulo = baseTrianguloInput.nextInt();
			
			Scanner alturaTrianguloInput = new Scanner(System.in);
			System.out.println("Informe a altura do triangulo: ");
			int alturaTriangulo = alturaTrianguloInput.nextInt();
			
			System.out.println("A área do triângulo é: " + baseTriangulo*alturaTriangulo/2);
			baseTrianguloInput.close();
			alturaTrianguloInput.close();
			break;
		case 7:
			Scanner raioCirculoInput = new Scanner(System.in);
			System.out.println("Digite o Valor do raio do Circulo: ");
			int raioCirculo = raioCirculoInput.nextInt();
			float pi = 3.14f;
			
			System.out.println("A área do Circulo é: " + pi*raioCirculo*raioCirculo);
			raioCirculoInput.close();
			break;
		default: 
			System.out.println("Operação Inválida!");
		}
			
		escolherForma.close();
	}

}
