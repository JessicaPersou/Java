import java.util.Scanner;
/* Fa�a um programa que receba tr�s inteiros e diga qual � o maior:*/
public class Ex_01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite um valor inteiro para A: ");
		a= leia.nextInt();
		System.out.println("Digite um valor inteiro para B: ");
		b= leia.nextInt();
		System.out.println("Digite um valor inteiro para C: ");
		c= leia.nextInt();
		
		if(a>b && a>c) {
			System.out.println("O valor de A � maior!!!");
		}else if(b>a && b>c) {
			System.out.println("O valor de B � maior!!!");
		}else if(c>a && c>b){
			System.out.println("o valor de C � maior!!!");
		}else {
			System.out.println("Deu empate!!!");
		}
		
	}

}
