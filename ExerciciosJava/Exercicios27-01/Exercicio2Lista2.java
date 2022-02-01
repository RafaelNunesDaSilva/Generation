package ExerciciosJava2;

import java.util.Scanner;

public class Exercicio2Lista2 {
    public static void main(String args[]) {
    	
    	Scanner leia = new Scanner(System.in);
    	
    	int num1;
    	int []impar = {0,0,0,0,0};
    	int []par = {0,0,0,0,0};
    	
    	
    	for(int i=0; i<10; i++) {
    		System.out.println("Informe um número: ");
    		num1 = leia.nextInt();
    		
    		
    		if(num%2 != 0){
    			impar = addElement(impar, num);
    		}else {
    			par = addElement(par, num);
    		}
    	}
    	
    	
    }
    private static int[] adElement(int[] impar, int num) {
    	retun null;
    }
    
}
