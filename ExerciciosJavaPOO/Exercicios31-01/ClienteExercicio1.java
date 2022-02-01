package ExerciciosPOO;

public class ClienteExercicio1 {
	
	private String name;
	private double altura;
	private double peso;
	
	public ClienteExercicio1(String hud, double Carol, double lindinho) {
		this.name = hud;
		this.altura = Carol;
		this.peso = lindinho;
	}
	
	public ClienteExercicio1(String nome, double peso) {   
		this.name = nome;
		this.peso = peso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String imc() {
		double imc = this.peso / (this.altura * this.altura);
		return String.format("%.2f", imc);
	}
	
}


