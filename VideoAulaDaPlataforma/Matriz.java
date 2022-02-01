package VideoPackage;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[3][2];
		Scanner leia = new Scanner(System.in);

		matriz[0][0] = 20;
		matriz[0][1] = 23;
		matriz[1][0] = 67;
		matriz[1][1] = 90;
		matriz[2][0] = 98;
		matriz[2][1] = 98;

		for (int x = 0; x <= 2; x++) {
			for (int y = 0; y <= 1; y++) {
				System.out.println(matriz[x][y]);
			}
		}

	}

}
