import java.util.Scanner;
import java.lang.Math;
/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
public class Ex_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double n;
		System.out.println("Informe um n�mero: ");
		n=leia.nextDouble();
		if(n%2==0) {
			double raiz = Math.pow(n,2);
			System.out.println("Par, sua raiz quadrada �: " + raiz);
		}else {
			n=n*n;
			System.out.println("�mpar, seu valor ao quadrado �: " + n);
		}
	}

}
