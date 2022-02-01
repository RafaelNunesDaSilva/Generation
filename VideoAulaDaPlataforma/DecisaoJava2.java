package VideoPackage;

import java.util.Scanner;

public class DecisaoJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de opções carinhosas");
		System.out.println("\n1-Não desista dos seus sonhos...");
		System.out.println("\n2-Você é capaz...");
		System.out.println("\n3-Seja perseverante...");
		System.out.println("\n4-Seus sonhos são possíveis...");
		System.out.println("\n5-Persista, resista e não desista...");
		op = ler.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\n1-Não desista  dos seus sonhos...");
			break;
		case 2:
			System.out.println("\n2-Você é capaz...");
			break;
		case 3:
			System.out.println("\n3-Seja perseverante...");
			break;
		case 4:
			System.out.println("\n4-Seus sonhos são possíveis...");
			break;
		case 5:
			System.out.println("\n5-Persista, resista e não desista...");
			break;
		
			
		}
		
	}

}
