package Exercicio01;

public class Animais {
	private String nome;
	private int idade;
	private boolean imiteSom;

	public Animais(String nome, int idade, boolean imiteSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.imiteSom = imiteSom;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isImiteSom() {
		return imiteSom;
	}

	public void setImiteSom(boolean imiteSom) {
		this.imiteSom = imiteSom;
	}

	public String toString() {
		return "Animal [nome: " + nome + ", idade: " + idade + ", imiteSom: " + imiteSom + "]";
	}
}
