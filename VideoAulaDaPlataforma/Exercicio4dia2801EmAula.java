package VideoPackage;

import java.util.Scanner;

public class Exercicio4dia2801EmAula {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];
		int l,c,constante,op;
		
		for(l=0; l<2; l++) 
		{
			for(c=0; c<2; c++) 
			{
				System.out.println("\nEntre com M1: ");
				m1[l][c] = leia.nextFloat();
				System.out.println("\nEntre com M2: ");
				m2[l][c] = leia.nextFloat();
			}
		}
		
		do
		{
		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1 - Somar as duas matrizes");
		System.out.println("\n2 - Subtrair a primeira matriz da segunda");
		System.out.println("\n3 - Adicionar uma constante as duas matrizes");
		System.out.println("\n4 - imprimir as duas matrizes");
		System.out.println("\n0 - Finalizar o programa...");
		op = leia.nextInt();
		
		}while(op != 0);
		
		
	}

}
