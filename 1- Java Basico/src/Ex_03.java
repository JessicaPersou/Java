import java.util.Scanner;
public class Ex_03 {
	/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e 
	 * mostre-o expresso em horas, minutos e segundos.*/
	public static void main(String[]args) {
		int hora, minuto=60, segundo=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o tempo de dura��o do evento: ");
		segundo = leia.nextInt();
		hora=segundo/3600;
		minuto=segundo/60;
		
		
		
		System.out.println("Horas: "+hora);
		System.out.println("Minutos: "+ minuto);
		System.out.println("Segundos: "+ segundo);
	}
}
