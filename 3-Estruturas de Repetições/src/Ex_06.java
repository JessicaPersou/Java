import java.util.Scanner;
/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
 *  Para sair digitar 0(zero).(DO...WHILE)*/
public class Ex_06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, somaN=0, media=0, multiplo=0;
		
		do {
			System.out.println("Digite um n�mero inteiro: ");
			n=leia.nextInt();
			System.out.println("Para encerrar digite 0");
			if(n%3==0 && n!=0) {
				somaN+= n;				
				multiplo++;	
			}
		}while(n!=0);
		media=somaN/multiplo;
		System.out.println("A m�dia de multiplos de tr�s �: " + media);
	}

}
