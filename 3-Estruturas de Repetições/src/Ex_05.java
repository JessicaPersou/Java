import java.util.Scanner;
/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
public class Ex_05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, soma=0;
		
		do {
			System.out.println("N�mero: ");
			num = leia.nextInt();
			soma= num+ soma;
		}while(num>=1);
			if(num==0) {				
				System.out.println("A soma dos n�meros digitados �: "+ soma);	
			}
	}

}
