package testeJava;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		int opcao = 0 ;
		int numero1, numero2, resultado = 0;
		Scanner opc = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		System.out.println("        Calculadora     \n" + "\n Escolha uma das Opções Abaixo:" + "\n 1 - Calculo de soma"
				+ "\n 2 - Calculo de subtação" + "\n 3 - Calculo de multiplicação" + "\n 4 - Calculo de divisão"
				+ "\n 5 - Sair");
		opcao = opc.nextInt();
		if (opcao == 1) {
			System.out.println("        Soma \n Digite o primeiro número:");
			numero1 = n.nextInt();
			System.out.println("Digite o segundo número:");
			numero2 = n.nextInt();
			resultado = numero1 + numero2;
			System.out.println("O resultado é " + resultado);
		} else if (opcao == 2) {
			System.out.println("        Subtração \n Digite o primeiro número:");
			numero1 = n.nextInt();
			System.out.println("Digite o segundo número:");
			numero2 = n.nextInt();
			resultado = numero1 - numero2;
			System.out.println("O resultado é " + resultado);
		} else if (opcao == 3) {
			System.out.println("        Multiplicação \n Digite o primeiro número:");
			numero1 = n.nextInt();
			System.out.println("Digite o segundo número:");
			numero2 = n.nextInt();
			resultado = numero1 * numero2;
			System.out.println("O resultado é " + resultado);
		} else if (opcao == 4) {
			System.out.println("        Divisão \n Digite o primeiro número:");
			numero1 = n.nextInt();
			System.out.println("Digite o segundo número:");
			numero2 = n.nextInt();
			resultado = numero1 / numero2;
			System.out.println("O resultado é " + resultado);
		} else if (opcao == 5) {
			System.out.println("Programa encerrado");
		} else {
			System.out.println("Opção inválida - Programa encerrado");

		}

	}

}
