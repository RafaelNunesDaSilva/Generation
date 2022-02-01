package ExercicioJava;

import java.util.Scanner;

public class ExercicioJava4 {
	public static void main(String args[]) {
		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];

		int opcao;

		Scanner leia = new Scanner(System.in);

		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {
				System.out.println("m1[" + x + "][" + y + "] = ");
				m1[x][y] = leia.nextFloat();
				System.out.println("m2[" + x + "][" + y + "] = ");
				m2[x][y] = leia.nextFloat();
			}
		}

		System.out.println("(1) somar as duas matrizes" 
		               + "(2) subtrair a primeira matriz da segunda"
		               + "(3) adicionar uma constante as duas matrizes" 
		               + "(4) imprimir as matrizes");

		System.out.println("\nEscolha uma das opções acima: ");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					m3[x][y] = m1[x][y] + m2[x][y];
					System.out.println("[" + m3[x][y] + "]");

				}
				System.out.println("\n");
			}
			break;
		case 2:
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					m3[x][y] = m1[x][y] - m2[x][y];
					System.out.println("[" + m3[x][y] + "]");

				}
				System.out.println("\n");
			}
			break;
		case 3:
			System.out.println("Escreva uma valor para matriz 1");
			m1[0][0] = leia.nextFloat();
			System.out.println("Escreva uma valor para matriz 2");
			m2[1][0] = leia.nextFloat();
			System.out.println("Matriz 1");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.println("[" + m1[x][y] + "]");
				}
				System.out.println("\n");
			}

			System.out.println("Matriz 2");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.println("[" + m2[x][y] + "]");
				}
				System.out.println("\n");
			}

			break;
		case 4:
			System.out.println("Matriz 1");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.println("[" + m1[x][y] + "]");
				}
				System.out.println("\n");
			}

			System.out.println("Matriz 2");
			for (int x = 0; x < 2; x++) {
				for (int y = 0; y < 2; y++) {
					System.out.println("[" + m2[x][y] + "]");
				}
				System.out.println("\n");
			}
			break;
		default:
			System.out.println("\nOpção inválida");
			break;
		}
	}

}
