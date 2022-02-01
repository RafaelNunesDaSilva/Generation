package VideoPackage;

import java.util.*;

public class LacosCondicionais {
	public static void main(String args[]) {

		Scanner leia = new Scanner(System.in);
		int idade;
		String nome;

		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		System.out.println("Entre com o seu nome: ");
		nome = leia.nextLine();
		System.out.println("Seu nome: " + nome);
		System.out.println("Sua idade: " + idade);

		if (idade > +18) {
			System.out.println("\nVoce é maior de idade...");
		}
		else if (idade >= 1 && idade < 18) {
			System.out.println("\nVoce é menor de idade...");
		}
		else 
		{
			System.out.println("\nVoce entrou com uma idade inválida...");
		}
	}
}//BUGADO
