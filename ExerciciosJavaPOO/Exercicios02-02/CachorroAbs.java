package Exercicio02;

public class CachorroAbs extends ClasseAbs {

	public CachorroAbs() {
		super("Caachorro");
	}

	@Override
	public void som(double quantidade) {
		for (int i = 0; i < quantidade; i++) {
			System.out.println("O " + getEspecie() + "faz au au au au auauauau!!!\n");
		}
	}

}
