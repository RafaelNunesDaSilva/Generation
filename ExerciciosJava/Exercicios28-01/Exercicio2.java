package ExercicioJava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int soma = 0, contImpar = 0;
		int[] numeros = new int[6];

		for (int x = 0; x <= 5; x++) {
			System.out.println("Dig�te um valor: ");
			numeros[x] = leia.nextInt();
		}
		for (int y = 0; y <= 5; y++) {

			if (numeros[y] % 2 == 0) {
				soma = soma + numeros[y];
				System.out.println("O n�mero par �: " + numeros[y]);

			} else if (numeros[y] % 2 != 0) {
				contImpar++;
				System.out.println("O n�mero impar �: " + numeros[y]);
			}
		}

		System.out.println("A soma dos n�meros pares s�o: " + soma);
		System.out.println("A quantidade de n�meros impares � igual a: " + contImpar);
	}
}
