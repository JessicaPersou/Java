import java.util.Scanner;
/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/
public class Ex_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Entre com o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1<=n2 && n2<=n3) {
			System.out.println("1� " + n1 + " - 2� " + n2 + " - 3� " + n3);
		}else if(n1<=n3 && n2<=n2) {
			System.out.println("1� " + n1 + " - 2� " + n3 + " - 3� " + n2);
		}else if(n2<=n1 && n1<=n3){
			System.out.println("1� " + n2 + " - 2� " + n1 + " - 3� " + n3);
		}else if(n2 <= n3 && n3 <= n1)  {
			System.out.println("1� " + n2 + " - 2� " + n3 + " - 3� " + n1);
		} else if (n3 <= n1 && n1 <= n2){
			System.out.println("1� " + n3 + " - 2� " + n1 + " - 3� " + n2);
		}else /* n3 <= n2 && n2 < n1 */{
			System.out.println("1� " + n3 + " - 2� " + n2 + " - 3� " + n1);
		}
		
		
	}

}
