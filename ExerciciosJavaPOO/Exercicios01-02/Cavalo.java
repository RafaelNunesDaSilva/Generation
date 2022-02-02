package Exercicio01;

public class Cavalo extends Animais{
	
	private boolean deveCorrer;

	public Cavalo(String nome, int idade, boolean imiteSom, boolean deveCorrer) {
		super(nome, idade, imiteSom);
		this.deveCorrer = deveCorrer;
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

	public String toString() {
		return "Cavalo [deveCorrer=" + deveCorrer + ", isDeveCorrer()=" + isDeveCorrer() + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", isImiteSom()=" + isImiteSom() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
