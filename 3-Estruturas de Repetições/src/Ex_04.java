import java.util.Scanner;
/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es 
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema 
 * que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.*/

public class Ex_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int pessoa=0, idade, menuSexo=0, menuPsico=0;
		System.out.println("Informe a sua idade: ");
		idade = leia.nextInt();
		
		switch(menuSexo) {
			case 1:
				System.out.println("Feminino");
				break;
			case 2:
				System.out.println("Masculino");
				break;
			case 3:
				System.out.println("Outros");
				break;
			}
		
		
		while(pessoa<=5) {
			
			
			switch(menuPsico) {
			case 1:
				System.out.println("Calma (o)");
				break;
			case 2:
				System.out.println("Nervosa (o)");
				break;
			case 3:
				System.out.println("Agressiva (o)");
				break;
			}
		}

	}

}
