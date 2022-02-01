package ExerciciosJava2;

import java.util.Scanner;

public class Exercicio2Lista1 {

	public static void main(String args[]) {

		double num1, num2, num3, pos1 = 0, pos2 = 0, pos3 = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o número 1: ");
		num1 = leia.nextDouble();
		System.out.println("Informe o número 2: ");
		num2 = leia.nextDouble();
		System.out.println("Informe o número 3: ");
		num3 = leia.nextDouble();

		if (num1 < num2 && num1 < num3) {
			pos1 = num1;
			if (num2 < num3) {
				pos2 = num2;
				pos3 = num3;
			} else {
				pos2 = num3;
				pos3 = num2;
			}
		}

		if (num2 < num1 && num2 < num3) {
			pos1 = num2;
			if (num1 < num3) {
				pos2 = num1;
				pos3 = num3;
			} else {
				pos2 = num3;
				pos3 = num1;
			}
		}

		if (num3 < num2 && num3 < num1) {
			pos1 = num1;
			if (num2 < num3) {
				pos2 = num2;
				pos3 = num1;
			} else {
				pos2 = num1;
				pos1 = num2;
			}
		}

		System.out.println("A ordem crescente é de: " + pos1 + " " + pos2 + " " + pos3);
	}
}
