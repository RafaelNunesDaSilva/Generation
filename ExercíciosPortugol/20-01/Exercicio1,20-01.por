programa
{
	
	funcao inicio()
	{
		real vetor[5], maiorPont = 0.0

		para(inteiro per=0; per<5; per++)
		{
			escreva("\nEntre com um valor: ")
			leia(vetor[per])
               limpa()
			      se(maiorPont<vetor[per])
			         {
		                  maiorPont = vetor[per]
			         }
			
			      escreva(vetor[per]+" ")
			
		     }
		 para(inteiro per=0; per<5; per++){
	      escreva(vetor[per]+" - ")
		 }
		 escreva("\nO maior valor inserido foi: " + maiorPont)
	  }    
   } 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 64; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 6, 7, 5}-{maiorPont, 6, 17, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */