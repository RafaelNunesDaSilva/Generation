programa
{
	
	funcao inicio()
	{
		inteiro numeros[3][3], somaNumeros=0, somaDiagonal1=0, linha, coluna
          // pré-definir um numero na coluna = numeros [1][2] = 14
		para(linha=0; linha<3; linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um valor: ")
				leia(numeros[linha][coluna])
				somaNumeros += numeros[linha][coluna]

				se(linha == coluna)
				{
					somaDiagonal1 += numeros[linha][coluna]
				}
			}
		}
		escreva("\nSomatório dos valores da matriz: "+somaNumeros)
		escreva("\nSomatório dos valores da diagonal principal: "+somaDiagonal1)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 578; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7}-{somaNumeros, 6, 25, 11};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */