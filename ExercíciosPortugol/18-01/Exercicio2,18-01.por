programa
{
	
	funcao inicio()
	{
		real N, E, salarioT, salarioE
          cadeia C


          escreva("Qual o nome do funcionário? ")
          leia(C)
		escreva("Quantas horas o funcionário trabalhou? ")
		leia(N)

		se (N > 50) {
			E = N - 50
			salarioE = (E * 20.0)
			salarioT = (50 * 10.0 ) + salarioE
			escreva("Seu salário excedente é de: R$" + salarioE + "\nSeu salário total é de: R$" + salarioT)

		
		} senao se (N <=50 e N > 0) {
			salarioT = N * 10
			escreva("Seu salário total é de: R$" + salarioT)
			
		}senao se (N <= 0) {
			escreva("Você nem trabalhou esse mês?!") 
			
		}
	}
}

/*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
 E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
 armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento 
 imprimir o salário total e o salário excedente.\*
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 604; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */