import java.util.Scanner;
public class Ex_05 {
	/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno.
	 *  Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. */
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int nota1, nota2, nota3, mediaFinal;
		System.out.println("Informe a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("Informe a segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("Informe a terceira nota: ");
		nota3 = leia.nextInt();
		
		nota1=nota1*2;
		nota2=nota2*3;
		nota3=nota3*5;
		
		mediaFinal = (nota1+nota2+nota3)/10;
		
		System.out.println("Media Final �: "+ mediaFinal);
	}

}
