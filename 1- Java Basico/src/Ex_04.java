import java.util.Scanner;
/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C)
e calcule a seguinte express�o: d=r+s/2, onde r=(a+b)� e s=(b+c)�*/
public class Ex_04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c,d,r,s;
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextInt();
		r=(a+b)*(a+b);
		s=(b+c)*(b+c);
		d= (r+s)/2;
		System.out.println("O Valor de D �: " + d);
	}

}
