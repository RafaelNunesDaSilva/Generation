package PackageExercícios1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
    	
    	double nota1, nota2, nota3, media;
    	
    	Scanner leia = new Scanner(System.in);
    	
    	System.out.println("Entre com a nota 1: ");
    	nota1 = leia.nextDouble();
    	System.out.println("Entre com a nota 2: ");
    	nota2 = leia.nextDouble();
    	System.out.println("Entre com a nota 3: ");
    	nota3 = leia.nextDouble();
    	
    	media = ((nota1*2)+(nota2*3)+(nota3*5)) / 10;
    	
    	
    System.out.println("A média aritmética das notas é de: "+media);
    	
    }
}
