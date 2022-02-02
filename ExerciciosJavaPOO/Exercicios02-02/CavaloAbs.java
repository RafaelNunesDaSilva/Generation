package Exercicio02;

public class CavaloAbs extends ClasseAbs {

	public CavaloAbs() {
		super("Cavalo");
	}

	@Override
	public void som(double quantidade) {
		for (int i = 0; i < quantidade; i++) {
			System.out.println("O " + getEspecie() + "faz Iiiiiiiiirrrriiirrriiiii!!!\n");
		}
	}

}
