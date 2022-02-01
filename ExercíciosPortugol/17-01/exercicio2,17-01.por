programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias,TDias


		escreva("Qual a sua idade em dias?")
		leia(TDias)

  
          anos = (TDias / 365)
          meses = (TDias % 365) / 30
          dias = (TDias % 365) % 30

		escreva ("\nVoce tem " + anos + " anos, " + meses + " meses e " + dias + " dias.")
		//escreva ("\nVoce tem " + meses + " meses")
		//escreva ("\nVoce tem " + dias + " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = 17, 6, 9, 10, 13, 14, 15;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */