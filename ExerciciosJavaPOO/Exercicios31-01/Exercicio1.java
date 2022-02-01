package ExerciciosPOO;

import ExerciciosPOO.ClienteExercicio1;

    public class Exercicio1 {
	
	public static void main(String[] args) {
		
		ClienteExercicio1 Ale = new ClienteExercicio1("Alessandro Castro", 1.81, 93);
		ClienteExercicio1 Hud = new ClienteExercicio1("Hudson Lucas", 1.75, 68.5);
		ClienteExercicio1 Denner = new ClienteExercicio1("Denner Vieira", 1.89);
		
		System.out.println("O cliente "+ Ale.getName() + "tem o imc de: " + Ale.imc());
		
		System.out.println("O cliente "+ Hud.getName() + "tem o imc de: " + Hud.imc());
		
		System.out.println("O cliente "+ Denner.getName() + "tem o imc de: " + Denner.imc());
	}
}