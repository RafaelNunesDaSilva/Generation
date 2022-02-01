programa
{
	
	funcao inicio()
	{
		real n1[4][6], n2[4][6], m1[4][6], m2[4][6]

		para(inteiro linha = 0; linha < 4; linha++)
		{
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("Informe um valor: ")
				leia(n1[linha][coluna])
				limpa()
			}
		}
	para(inteiro linha = 0; linha < 4; linha++)
		{
			para(inteiro coluna = 0; coluna < 6; coluna++){
				escreva("Informe um valor: ")
				leia(n2[linha][coluna])
				limpa()
			}
		}
		
	para(inteiro linha = 0; linha < 4; linha++){
		para(inteiro coluna = 0; coluna < 6; coluna++){
			m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
		}
	}
	
	para(inteiro linha = 0; linha < 4; linha++){
		para(inteiro coluna = 0; coluna < 6; coluna++){
			m2[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]
		}
	}

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 77; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 7, 2}-{n2, 6, 17, 2}-{m1, 6, 27, 2}-{m2, 6, 37, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */