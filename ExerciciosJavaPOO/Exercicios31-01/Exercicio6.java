package ExerciciosPOO;

import ExerciciosPOO.ContaExercicio6;

public class Exercicio6 {
	
	public static void main(String args[]) {
		
		ContaExercicio6 contaAle = new ContaExercicio6("Alessandro Castro", "Santander", 600);
		
		System.out.println(contaAle.getSaldo());
		contaAle.deposito(200.00);
		System.out.println(contaAle.getSaldo());
		
		
		System.out.println("Foi sacado" + contaAle.saque(700) + " e o total em conta agora é: " + contaAle.getSaldo());
	}

}
