import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo a sua calculadora em Java!");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String userName = scan.nextLine();
		
		System.out.printf("Bem vindo %s%n", userName);

		System.out.println("Selecione a operação matemática \n 1- Adição 2- Subtração 3- Multiplicação 4- Divisão");
		String operação = scan.nextLine();
		
		if (operação.equals("1")) {
			
			System.out.println("Você selecionou a Adição!");
			
			System.out.println("Digite o primeiro valor:");
			double valor1 = scan.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			double valor2 = scan.nextDouble();
			
			Main main = new Main();
			main.adicao(valor1, valor2);
			
		} else if (operação.equals("2")) {
			System.out.println("Você selecionou a subtração!");
			
			System.out.println("Digite o primeiro valor:");
			double valor1 = scan.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			double valor2 = scan.nextDouble();
			
			Main main = new Main();
			main.subtracao(valor1, valor2);
			
		} else if (operação.equals("3")) {
			System.out.println("Você selecionou a multiplicação!");
			
			System.out.println("Digite o primeiro valor:");
			double valor1 = scan.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			double valor2 = scan.nextDouble();
			
			Main main = new Main();
			main.multiplicacao(valor1, valor2);
		} else {
			System.out.println("Você selecionou a divisão!");
			
			System.out.println("Digite o primeiro valor:");
			double valor1 = scan.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			double valor2 = scan.nextDouble();
			
			Main main = new Main();
			main.divisao(valor1, valor2);
		}
		
	}
	
	public void adicao(double valor1, double valor2) {
		
		double resultado = valor1 + valor2;
		
		System.out.println("O resultado foi: " + resultado);
	}
	
	public void subtracao(double valor1, double valor2) {
		double resultado = valor1 - valor2;
		
		System.out.println("O resultado foi: " + resultado);
	}
	
	public void multiplicacao(double valor1, double valor2) {
		double resultado = valor1 * valor2;
		
		System.out.println("O resultado foi: " + resultado);
	}
	
	public void divisao(double valor1, double valor2) {
		double resultado = valor1 / valor2;
		
		System.out.println("O resultado foi: " + resultado);
	}

}
