programa
{
	
	funcao inicio()
	{
		inteiro num, mult

		escreva("Digite o número: ")
		leia(num)
		escreva("Digite o multiplicador: ")
		leia(mult)

		escreva (num + " ")

          se(num > 0 e mult != 0){
		enquanto(num <= 100)
		{
			num = num * mult
			escreva(num + " ")
		}
          }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */