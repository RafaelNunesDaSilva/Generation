programa
{
	
	funcao inicio()
	{
		real P, M, E

		escreva("Digite aqui o peso dos tomates: ")
		leia(P)

		se (P>=50){
			E = P - 50
		     M = E * 4
		     escreva("Voce excedeu o peso permitido pelo regulamento do estado de SP em:" + E + "kilos\n"
		     + "O valor em multa a ser pago é de: " + M)
		}
		senao se (P < 0){
		escreva("Não consta nenhuma mercadoria!")
		}
		senao se (P <= 50 e P > 0){
			E = 0.0
			M = 0.0
			escreva("Multa = " + M + "\n Excesso + " + E 
			)
		}
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 483; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */