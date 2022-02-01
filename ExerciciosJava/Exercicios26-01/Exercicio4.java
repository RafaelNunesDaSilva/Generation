package PackageExercícios1;

import java.util.Scanner;

public class Exercicio4 {

	
	public static void main(String[] args) {
		
		double a, b, c, r, s, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextDouble();
		
		r = Math.pow((a+a), 2);
		s = Math.pow((b+c), 2);
		d = (r+s) / 2;
		
		System.out.println("O valor de D é: "+d);
		
				
		
	}
}
