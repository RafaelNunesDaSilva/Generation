package ExerciciosJava2;

import java.util.Scanner;

public class Exercicio1Lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		for (int num = 1000; num < 2000; num++) {
			if (num % 11 == 5) {
				System.out.println(num + "\n");
			}
		}
	}

}
