package VideoPackage;

import java.util.Scanner;

public class TesteEntradadeDados {
	
	public static void main(String args[]) {
	
	Scanner leia = new Scanner(System.in);
	
	int A, B, soma;
	
    System.out.println("Entre com o valor de A: ");
    A = leia.nextInt();
    System.out.println("Entre com o valor de B: ");
    B = leia.nextInt();
    
    soma = A + B;
    
    System.out.println("A soma de A + B é " + soma + "!!");
    

	
	}
}
