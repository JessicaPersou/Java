import java.util.Scanner;
/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
 *  A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.*/
public class Ex_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[10],x,maior=0, anota=0, cont=0, media=0;
		
		for(x=0;x<10;x++) {
			System.out.println("Insira um n�mero de 1 a 6: ");
			vetor[x] = leia.nextInt();
			anota+=vetor[x];
			
			if(vetor[x]>maior) {
				maior=vetor[x];
			}
			
			if(vetor[x]==maior) {
				cont++;
			}
			
		}	media= anota/10;
			System.out.println("A maior pontua��o apareceu: " + cont + " vezes, e a m�dia �: " + media);
	}

}
