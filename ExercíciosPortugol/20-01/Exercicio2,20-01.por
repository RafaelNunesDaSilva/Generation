programa
{
	
	funcao inicio()
	{
		real vetor[5], somaLan= 0.0, mediaLan, maiorPont = 0.0, ocorrenc = 0.0

		para(inteiro rol=0; rol<5; rol++)
		{
			escreva("Qual foi o valor do dado? ")
			leia(vetor[rol])

			somaLan+=vetor[rol]
			limpa()

			se(vetor[rol] > maiorPont) 
			{
				maiorPont = vetor[rol]
			     se(vetor[rol] == maiorPont){
			     	ocorrenc++
			     }senao{
			     	ocorrenc = 0.0
			     	ocorrenc++
			     }
			      maiorPont = vetor[rol]
			}
			
		}
		

          mediaLan = somaLan / 5
		escreva("A média do lançamento doi de: " + mediaLan)
		escreva("\nA ocorrência em que: " + maiorPont + " apareceu, foi " + ocorrenc + "x")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 672; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 6, 7, 5}-{somaLan, 6, 17, 7}-{mediaLan, 6, 31, 8}-{maiorPont, 6, 41, 9}-{ocorrenc, 6, 58, 8}-{rol, 8, 15, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */