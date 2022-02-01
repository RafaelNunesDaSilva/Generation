programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real habitante, salario = 0.0,salarioTotal = 0.0, numFilho,numFilhoTotal = 0.0, mediaFilho,
		mediaSalario = 0.0, maiorSalario = 0.0, percentual, pessoasAte100 = 0.0, numHab

		numHab = 3.0

		para(habitante = 1.0; habitante <= numHab; habitante++) 
		{
			escreva("Qual o seu salário? ")
			leia(salario)
			escreva("Quantos filhos você tem?")
			leia(numFilho)
			//limpa()

			salarioTotal = salarioTotal + salario
			numFilhoTotal = numFilhoTotal + numFilho

			se(salario > maiorSalario){
			maiorSalario = salario
		   }

		   se(salario <= 100)
		   {
		   	pessoasAte100++
		   }
		}

		mediaSalario = (salarioTotal / numHab)
		mediaFilho = numFilhoTotal / numHab
		percentual = pessoasAte100 / numHab * 100
		limpa()
		escreva("A média do salário é de: R$" + mediaSalario)
		escreva("\nA média de filhos por habitante é de: " + mediaFilho)
		escreva("\nO maior salário dentre os habitantes é de: R$" + maiorSalario)
		escreva("\nO percentual de pessoas com salário até R$100,00 é de: " +percentual+ "%!")
	 }
  } 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 800; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */